package ru.javalang.module06.tasks.t01;

/**
 * Составить класс Person с наибольшим количеством общих параметров (не более 20)
 */

public class Person {
    int Id;
    String Name;
    String Family;
    int Age;
    String City;
    String Gender;
    String Hobby;
    String Telefon;
    String eMail;
    String Car;

    public Person() {
    }

    public Person(int id, String name, String family) {
        Id = id;
        Name = name;
        Family = family;
    }

    public Person(int id, String name, String family, int age, String city, String gender) {
        Id = id;
        Name = name;
        Family = family;
        Age = age;
        City = city;
        Gender = gender;
    }

    public Person(int id, String name, String family, int age, String city, String gender, String hobby, String telefon, String eMail, String car) {
        Id = id;
        Name = name;
        Family = family;
        Age = age;
        City = city;
        Gender = gender;
        Hobby = hobby;
        Telefon = telefon;
        this.eMail = eMail;
        Car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Family='" + Family + '\'' +
                ", Age=" + Age +
                ", City='" + City + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public Person setId(int id) {
        Id = id;
        return this;
    }
}
