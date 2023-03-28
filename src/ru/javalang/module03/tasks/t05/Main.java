package ru.javalang.module03.tasks.t05;

import java.util.Scanner;

/**
 * Вводится целое число (не более 4 разрядов!).
 * Определить количество цифр в нём.
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Vvedite chislo (ne bolsche 4 razryadov): ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x>9999) {
            System.out.println("B chisle dolzhno bit ne bolsche 4 razryadov!!!");
        } else if (x>999) {
            System.out.println("B chisle 4 razryada");
        } else if (x>99) {
            System.out.println("B chisle 3 razryada");
        } else if (x>9) {
            System.out.println("B chisle 2 razryada");
        } else {
            System.out.println("B chisle 1 razryad");
        }
    }
}
