package ru.javalang.module03.tasks.t02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число и проверить,
 * принадлежит ли это число диапазону от N до M (включительно).
 */
public class Main {
    public static void main(String[] args) {

        int n=10, m=100;

        System.out.print("Vvedite chislo: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        String s = x >= n & x <= m  ? "Vhodit v diapazon" : "Ne Vhodit v diapazon";
        System.out.println(s);

    }
}
