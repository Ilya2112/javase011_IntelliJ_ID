package ru.javalang.module06.tasks.t02;

/**
 * Составить класс для автомобиля с произвольными параметрами и конструкторами
 */

public class Car {

    private String Marka;
    private String YearRelease;
    private String GosNumber;
    private String Color;
    private String VIN;


    public Car(String marka, String yearRelease, String color) {
        Marka = marka;
        YearRelease = yearRelease;
        Color = color;
    }

    public Car(String marka, String yearRelease, String gosNumber, String color, String VIN) {
        Marka = marka;
        YearRelease = yearRelease;
        GosNumber = gosNumber;
        Color = color;
        this.VIN = VIN;
    }

    public String Marka() {
        return Marka;
    }

    public Car setMarka(String marka) {
        Marka = marka;
        return this;
    }

    public String YearRelease() {
        return YearRelease;
    }

    public Car setYearRelease(String yearRelease) {
        YearRelease = yearRelease;
        return this;
    }

    public String GosNumber() {
        return GosNumber;
    }

    public Car setGosNumber(String gosNumber) {
        GosNumber = gosNumber;
        return this;
    }

    public String Color() {
        return Color;
    }

    public Car setColor(String color) {
        Color = color;
        return this;
    }

    public String VIN() {
        return VIN;
    }

    public Car setVIN(String VIN) {
        this.VIN = VIN;
        return this;
    }
}
