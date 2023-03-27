package ru.javalang.module02.tasks.t03;

import java.util.Scanner;

/**
 * Дано целое число n. Выведите следующее за ним четное число.
 * При решении этой задачи нельзя использовать условную инструкцию if и циклы.
 * Входные данные
 * Вводится натуральное число.
 * Выходные данные
 * Выведите ответ на задачу.
 *
 * For example:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    7       |   8       |
 * --------------------------
 * |    8       |   10      |
 * --------------------------
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite celoe chislo1: ");
        int x = in.nextInt();
        System.out.println("Sledyuschee chetnoe chislo: " + ((x/2+1)*2));
    }
}
