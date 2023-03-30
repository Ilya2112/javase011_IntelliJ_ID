package ru.javalang.module11.tasks.t01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int x,y;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);

        try {

            System.out.println("Введите 1ое число: ");
            x = Integer.parseInt(bf.readLine());
            System.out.println("Введенное 1ое число: " + x);
            System.out.println();

            System.out.println("Введите 2ое число: ");
            y = Integer.parseInt(bf.readLine());
            System.out.println("Введенное 2ое число: " + y);
            System.out.println("Сумма: " + (x+y));

        } catch (Exception e) {

            System.out.println("Что то пошло не так...");
            e.printStackTrace();

        }

    }

}
