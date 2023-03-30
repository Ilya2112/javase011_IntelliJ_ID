package ru.javalang.module10.tasks.t01;

public class Main {


    public static void main(String[] args) {
        int x=0, y=50, z=0;

        try {
            x=y/z;
            System.out.println("Результат деления: " + x);
        }
        catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("На 0 делить нельзя");
        }


    }

}
