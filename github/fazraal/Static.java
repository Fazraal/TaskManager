package com.github.fazraal;

import java.io.*;

public class Static {

    public static void serializeTaskMap(Tesk taskMap, OutputStream out) throws IOException {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(taskMap);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static Tesk deserializeTaskMup(InputStream in) throws ClassNotFoundException {
        Tesk task = new Tesk();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(in);
            task = (Tesk) inputStream.readObject();
            inputStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return task;
    }
}
