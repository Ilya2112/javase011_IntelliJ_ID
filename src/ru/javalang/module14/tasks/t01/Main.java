package ru.javalang.module14.tasks.t01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> car = new ArrayList<>();

        car.add("Lada");
        car.add("Audi");
        car.add("BMW");
        car.add("Volkswagen");
        car.add("Volvo");
        car.add("Skoda");
        car.add("Mersedes");

        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }

        System.out.println();
        car.sort(Comparator.naturalOrder());

        System.out.println("Отсортированный список: ");
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }

    }

}
