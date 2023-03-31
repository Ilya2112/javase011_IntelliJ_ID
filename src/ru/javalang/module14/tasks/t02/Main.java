package ru.javalang.module14.tasks.t02;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> user = new HashMap<>();

        user.put(22,"Илья");
        user.put(12,"Олег");
        user.put(43,"Виталий");
        user.put(21,"Кирилл");
        user.put(42,"Оля");
        user.put(2,"Иван");

        System.out.println(user.values());
        System.out.println();

        //user = sortBy;
/*
        for (int i = 0; i < user.size(); i++) {

        }
*/
    }

}
