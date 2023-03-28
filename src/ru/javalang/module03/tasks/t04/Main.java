package ru.javalang.module03.tasks.t04;

import java.util.Scanner;

/**
 * Показать модуль введённого числа.
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Vvedite chislo: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println("Modul chisla " + x + " ravno: " + Math.abs(x));
    }
}
