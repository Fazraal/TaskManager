package com.github.fazraal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();



    }
    public static void main(String[] args) {

        ObjectInputStream objectInputStream = null;
        Tesk tesk;
        {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream("File.bin"));
                tesk = Static.deserializeTaskMup(objectInputStream);
                System.out.println(tesk.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            String stringDate = new String("11/11/1111 11:11");
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(stringDate);
                //System.out.println(tesk.getTaskInfONDate(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }

    }


}
