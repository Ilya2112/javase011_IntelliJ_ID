package ru.javalang.module04.tasks.t03;

import java.util.Scanner;

/**
 * Развернуть массив в обратную сторону ("задом наперед").
 *
 *  Последний элемент должен находится на месте начального и наоборот.
 *
 *  Не разрешается использовать дополнительный массив.
 *
 *  Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя в памяти значение элементов массива.
 *
 *  For example:
 *
 *  Input	            Result
 *  6
 *  1 2 3 4 5 6	        6 5 4 3 2 1
 */
public class Main {

    public static void main(String[] args) {

        System.out.print("Vvedite chislo elementov massiva: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 0;

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
