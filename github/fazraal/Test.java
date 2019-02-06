package com.github.fazraal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

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
