package ru.javalang.module10.tasks.t02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileInputStream fileStream = null;
        try {
            fileStream=new FileInputStream("C:\\study\\javase011_IntelliJ_ID\\src\\ru\\javalang\\module10\\tasks\\t02\\TestFile.txt");
            while (fileStream.available()>0){
                int b = fileStream.read();
                System.out.print((char)b + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
