package ru.javalang.module11.tasks.t03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        String firstName = "Иван";
        String lastName = "Иванов";
        String phoneNumber = "88005553535";
        int age = 777;

        try {
            FileOutputStream fo = new FileOutputStream("C:\\study\\javase011_IntelliJ_ID\\src\\ru\\javalang\\module11\\tasks\\t03\\11task03.txt");
            ObjectOutputStream oOS = new ObjectOutputStream(fo);
            User u = new User(firstName,lastName,phoneNumber,age);
            oOS.writeObject(u);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
