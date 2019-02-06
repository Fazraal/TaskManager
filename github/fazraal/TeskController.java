package com.github.fazraal;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TeskController {


    @FXML
    private TextField date;

    @FXML
    private Button cancel;

    @FXML
    private Button add;

    @FXML
    private TextArea tesk;

    @FXML
    void initialize(){

        cancel.setOnAction(event -> {

                    cancel.getScene().getWindow().hide();
                }
                );
        add.setOnAction(event -> {

            createTask();
           add.getScene().getWindow().hide();
        });
    }

    public void  createTask(){
        Tesk tesk = new Tesk();
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("File.bin"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String stringDate = this.date.toString();
            Date date1 = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(stringDate);
            System.out.println(date1);
            tesk.addTask(date1, this.tesk.getText());
            Static.serializeTaskMap(tesk, outputStream);
        } catch (ParseException e) {
            e.getStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}