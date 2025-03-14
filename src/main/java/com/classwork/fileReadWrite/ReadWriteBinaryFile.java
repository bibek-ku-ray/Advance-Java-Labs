package com.classwork.fileReadWrite;

import java.io.*;

public class ReadWriteBinaryFile {
    public static void main(String[] args) throws Exception {

        try {
            Student fred = new Student(2, "fred", "r@gmail.com");
            //read=input,write//output fro any stream
            File f = new File("students.dat");

            //if file does not exist
            if (!f.exists()) {
                ObjectOutputStream os1 = new ObjectOutputStream(
                        new FileOutputStream("students.dat"));
                os1.writeObject(fred);
                os1.close();
            } else {//if file exists
                FileOutputStream fos = new FileOutputStream("students.dat", true);
                ObjectOutputStream oos = new ObjectOutputStream(fos) {
                    protected void writeStreamHeader() throws IOException {
                        reset();
                    }
                };
                oos.writeObject(fred);
                oos.close();
            }
            FileInputStream fis = new FileInputStream("students.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student obj = null;
            while ((obj = (Student) ois.readObject()) != null) {
                System.out.println("Name:" + obj.getName() + ",Address:" + obj.getEmail());
            }
            ois.close();
        } catch (EOFException ex) {
            System.out.println("end of file rached");
        } catch (ClassNotFoundException | FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

