package com.github.fazraal;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Tesk  implements  Serializable {


    private Date date;
        private  String task;

        public  Tesk(){
        }

        public  void addTask(Date date, String task){
            this.date = date;
            this.task = task;
        }

        public Date getDate() {
            return date;
        }

        public String getTask() {
            return task;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTask(String task) {
            this.task = task;
        }

        @Override
        public String toString() {
            return super.toString();
        }
}
