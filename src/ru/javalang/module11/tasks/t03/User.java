package ru.javalang.module11.tasks.t03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    String firstName;
    String lastName;
    String phoneNumber;
    int age;

    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

}
