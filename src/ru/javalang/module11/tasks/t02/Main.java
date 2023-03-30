package ru.javalang.module11.tasks.t02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int x = 0;

        try {

            FileReader fr = new FileReader("C:\\study\\javase011_IntelliJ_ID\\11task02.txt");
            BufferedReader bf = new BufferedReader(fr);
            System.out.println("Введенные в файл числа:");
            String line;
            while ((line = bf.readLine()) != null)
            {
                x = x + Integer.parseInt(line);
                System.out.println(line);
            }
            System.out.println("Сумма чисел: " + x);
            bf.close();

        } catch (Exception e) {

            System.out.println("Что то пошло не так...");
            e.printStackTrace();

        }

    }

}
