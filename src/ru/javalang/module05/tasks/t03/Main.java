package ru.javalang.module05.tasks.t03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Применяя pattern-match выполните распознавание строк для простого тестирования:
 *
 * Формат теста:
 * ---------------------/
 * ? Вопрос
 * + Вариант ответа 1
 * - Вариант ответа 2
 * - Вариант ответа 3
 * - Вариант ответа 4
 * ---------------------/
 *
 * Каждый вопрос начинается с символа '?'
 * Каждый вариант ответа с '+' или '-', что соотвествует правильному и неверному ответу
 */

public class Main {
    public static void main(String[] args) {

        String[] test = new String[5];

        test[0] = "? Какого цвета Солнце";
        test[1] = "- Зеленый";
        test[2] = "- Синий";
        test[3] = "+ Желтый";
        test[4] = "- Черный";

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

        System.out.println();

        Pattern pattern = Pattern.compile("\\+.*");
        Matcher matcher;

        for (int i = 0; i < test.length; i++) {
            matcher = pattern.matcher(test[i]);
            while (matcher.find()) {
                System.out.println("Правильный ответ: " + test[i]);
            }
        }

    }
}
