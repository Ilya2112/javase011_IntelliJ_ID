package ru.javalang.module04.tasks.t04;

import java.util.Scanner;

/**
 * Вывести на экран значение самого часто повторяющегося элемента массива и число повторений.
 *
 *  Если в массиве несколько таких элементов,
 *  вывести из них тот, который имеет самый меньший номер.
 *
 *  For example:
 *
 *  Input	Result
 *  6
 *  1 2 3 1 2 1	    1 (3)
 *  5
 *  10 20 30 40 50	   10 (1)
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

        for (int i = 0; i < x/2; i++) {
            y = arr[i];
            arr[i]=arr[x-i-1];
            arr[x-i-1]=y;
        }

        for (int i = 0; i < x; i++) {
            System.out.println("Element massiva #" + (i+1) + ": " + arr[i]);
        }

    }
}
