package com.github.fazraal;

import java.io.Serializable;
import java.util.ArrayList;

public class TaskPool  implements Serializable {

    private ArrayList<Tesk> allTask = null;

    public TaskPool(Tesk[] tesks){
        ArrayList<Tesk> st = new ArrayList<>(tesks.length);
        for(int i =0; i<tesks.length ; i++){
            st.add(i,tesks[i]);
        }
        this.allTask = st;
    }

    public  TaskPool (ArrayList<Tesk> tesks) {
        this.allTask = tesks;
    }

    public ArrayList<Tesk> getAllTask() {
        return allTask;
    }

    public void setAllTask(ArrayList<Tesk> allTask) {
        this.allTask = allTask;
    }

    public Tesk getTask(int index){
        return (Tesk) this.allTask.get(index);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<allTask.size(); i++){
            stringBuilder.append(getTask(i).getDate());
            stringBuilder.append(" "  + getTask(i).getTask() );
        }
        return  stringBuilder.toString();
    }
}
