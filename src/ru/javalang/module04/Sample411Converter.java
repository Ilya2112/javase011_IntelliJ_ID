package ru.javalang.module04;

import java.util.Scanner;

/**
 * Практикум: Конвертор дня года в месяц и число
 *
 * Ввести с клавиатуры порядковый номер дня в диапазоне от 1 до 365
 */
public class Sample411Converter {

    // Задание константных переменных массивов
    public static String[] monthes = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    public static int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) throws Exception {

        System.out.print("Введите порядковый номер дня для определения месяца и числа: ");

        int n = new Scanner(System.in).nextInt();

        // Здесь должен быть код!

        int j = 0; // номер месяца

        for (int i = 0; i < monthDays.length; i++) {
            n = n - monthDays[i];
            if (n<=0) {
                j = i;
                break;
            }
        }

        //System.out.println(n);
        //System.out.println(j);
        System.out.println("Day: " + (monthDays[j]+n) + " Month: " + monthes[j]);


    }
}
