package ru.javalang.module04.tasks.t05;

import java.util.Scanner;

/**
 * Напишите программу, которая выполняет "сжатие массива целых чисел" –
 *  переставляет все нулевые элементы в конец.
 *  При этом все ненулевые элементы располагаются в начале в том же порядке.
 *
 *  Input	            Result
 *  6
 *  1 0 2 0 3 4         1 2 3 4 0 0
 */

public class Main {
    public static void main(String[] args) {

        System.out.print("Vvedite chislo elementov massiva: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y;

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Vvedite " + (i+1) + "ое chislo massiva: ");
            arr[i] = in.nextInt();
        }

        System.out.println();

        for (int i = 0; i < x-1; i++) {
            if (arr[i]==0){
                for (int j = i; j < x-1; j++) {
                    y = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=y;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.println("Element massiva #" + (i+1) + ": " + arr[i]);
        }

    }
}
