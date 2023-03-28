package ru.javalang.module03.tasks.t06;

import java.util.Scanner;

/**
 * Ввести с клавиатуры пятизначное число и определить, является ли оно палиндромом
 *
 * -------|---------|
 * Input  |  Result |
 * -------|---------|
 * 12321  |  true   |
 * 12345  |  false  |
 * -------|---------|
 *
 */

public class Main {
    public static void main(String[] args) {

        System.out.print("Vvedite 5ti znachnoe chislo: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println((x/10000==x%10) & (x/1000%10)==(x/10%10) ? "Polindrom" : "Ne polindrom");

    }
}
