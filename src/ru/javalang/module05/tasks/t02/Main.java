package ru.javalang.module05.tasks.t02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Используя форматирование времени и даты примените шаблон вывода:
 *
 * 2022-01-15 20:22:33
 *
 */
public class Main {
    public static void main(String[] args) {

        String DatePattern = "yyyy-MM-dd HH:mm:ss";
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern(DatePattern)));

    }
}
