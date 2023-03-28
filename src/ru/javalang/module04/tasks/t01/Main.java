package ru.javalang.module04.tasks.t01;

import java.util.Scanner;

/**
 * В этой задаче нужно вводить с клавиатуры значения элементов массива.
 *
 * Нужно заполнить значения элементов массива числами последовательности:
 *
 * 4, 7, 10, 13, 16, ,,,
 *
 * и вывести получившийся массив на экран.
 *
 * Не будет считаться верным решение, в котором элементы последовательности просто выводятся на экран,
 * не попадая в массив.
 *
 * Например:
 *
 *  Input	                    Result
 *  6
 *  4 7 10 13 16 19         { 4, 7, 10, 13, 16, 19 }
 */
public class Main {

    public static void main(String[] args) {

        System.out.print("Vvedite chislo: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 0;

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Vvedite " + (i+1) + "ое chislo massiva: ");
            arr[i] = in.nextInt();
        }

        System.out.println();

        for (int i = 0; i < x; i++) {
            System.out.println("Element massiva #" + (i+1) + ": " + arr[i]);
        }

    }


}
