package ru.javalang.module04.tasks.t06;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

/**
 * Написать программу для проведения минимального тестирования при помощи массивов:
 *
 * Вопросы - варианты ответов
 *
 * Вопрос1:
 * Вариант 11
 * Вариант 12
 * Вариант 13
 * Вариант 14
 *
 * Вопрос2:
 * Вариант 21
 * Вариант 22
 * Вариант 23
 * Вариант 24
 *
 * Предусмотреть идентификатор корректности для каждого варианта
 *
 * Выставить оценку по 5-бальной системе
 */

public class Main {

    public static void main(String[] args) {

        String[] questions = new String[2];
        String[][] variants = new String[2][4];
        String[][] answers = new String[2][4];
        Integer[] results = new Integer[2];

        questions[0] = "Какого цвета Солнце?";
        questions[1] = "Какая по счету планета Земля от Солнца?";

        variants[0][0] = "Зеленый"; answers[0][0] = "x";
        variants[0][1] = "Желтый"; answers[0][1] = "V";
        variants[0][2] = "Синий"; answers[0][2] = "x";
        variants[0][3] = "Черный"; answers[0][3] = "x";

        variants[1][0] = "1"; answers[1][0] = "x";
        variants[1][1] = "2"; answers[1][1] = "x";
        variants[1][2] = "3"; answers[1][2] = "V";
        variants[1][3] = "4"; answers[1][3] = "x";

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            System.out.println("Вопрос #" + (i+1));
            System.out.println(questions[i]);
            System.out.println();
            System.out.println("Варианты ответов:");

            for (int j = 0; j < variants[i].length; j++) {
                System.out.println((j+1) + ") " + variants[i][j]);
            }

            System.out.println();
            System.out.print("Введите номер Вашего ответа: ");
            results[i] = scanner.nextInt();

            if((results[i]>4)||(results[i]<1)){
                System.out.println("ОШИБКА!!! Такого варианта ответа нет. Попробуйте еще раз!");
                i--;
            } else {
                System.out.println("Ответ принят!");
            }

            System.out.println();
        }

        int totalQuestions = 2; // Всего вопросов
        int rightAnswers = 0; // Количество правильных ответов

        for (int i = 0; i < questions.length; i++) {
            if (answers[i][results[i]].equals("V")){
                rightAnswers++;
            }
        }

        /*
        System.out.println("rightAnswers = " + rightAnswers);
        float d = float(rightAnswers)/float(totalQuestions);
        System.out.println(d);
        System.out.println("Процент: " + (rightAnswers/totalQuestions*100));
        */

        if (rightAnswers==2){
            System.out.println("Ваша оценка 5");
        } else if (rightAnswers==1) {
            System.out.println("Ваша оценка 4");
        } else {
            System.out.println("Ваша оценка 3");
        }

    }

}
