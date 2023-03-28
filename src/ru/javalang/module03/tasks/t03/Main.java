package ru.javalang.module03.tasks.t03;

import java.util.Scanner;

/**
 * Написать программу для проверки кратности числа X числу Y
 * (оба числа вводятся с клавиатуры).
 */

public class Main {
    public static void main(String[] args) {

        System.out.print("Vvedite chislo X: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.print("Vvedite chislo Y: ");
        int y = in.nextInt();

        System.out.println(x % y == 0 ? "Kratno" : "Ne kratno");

    }
}
