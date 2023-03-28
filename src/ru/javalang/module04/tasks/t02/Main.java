package ru.javalang.module04.tasks.t02;

import java.util.Scanner;

/**
 * Выведите на экран сумму четных элементов массива.
 *
 *  Если в массиве нет четных элементов, выведите "NO".
 *
 *  Например:
 *
 *  Input	        Result
 *  6
 *  1 2 3 4 5 6	    12
 *  5
 *  9 7 5 3 1	    NO
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Vvedite chislo elementov massiva: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 0;

        int[] arr = new int[x];

        int SummCh = 0;

        for (int i = 0; i < x; i++) {
            System.out.print("Vvedite " + (i+1) + "ое chislo massiva: ");
            arr[i] = in.nextInt();
            if (arr[i]%2==0){
                SummCh = SummCh + arr[i];
            }
        }

        if (SummCh==0){
            System.out.println("Summa chetnih chisel: NO");
        } else {
            System.out.println("Summa chetnih chisel: " + SummCh);
        }

    }
}
