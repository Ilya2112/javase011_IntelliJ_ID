package ru.javalang.module06;

public class Sample607 {
    public static void main(String[] args) {
        String str = "Владивосток";
        System.out.println("В main – перед вызовом метода - str="+str);
        changeString(str);
        System.out.println("В main – после вызова метода  - str="+str);
    }

    private static void changeString(String s) {
        System.out.println("В методе – перед изменениями - str="+s);
        s = s+" Москва.";
        System.out.println("В методе – после изменений - str="+s);
    }
}
