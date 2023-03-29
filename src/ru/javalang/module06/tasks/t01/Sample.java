package ru.javalang.module06.tasks.t01;

public class Sample {
    public static void main(String[] args) {

        Person User = new Person(1,"Иван","Пупкин");
        Person[] User1 = new Person[2];
        User1[0]=new Person(2,"Олег", "Олегов",98, "Нью-Касл","Ж");

        User.setId(99);
        System.out.println(User);
        System.out.println(User1[0]);

    }
}
