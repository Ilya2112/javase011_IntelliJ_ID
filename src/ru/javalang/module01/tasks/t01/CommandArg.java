package ru.javalang.module01.tasks.t01;

public class CommandArg {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            System.out.println("Аргумент " + i + " = " + args[i]);
        }
    }
}
