package ru.javalang.module03.tasks.t01;

import java.util.Scanner;

/**
 *
 * Ввести число, и выяснить -
 * положительное оно, отрицательное, или равно нулю?
 *
 */

public class Main {
    public static void main(String[] args) {
        System.out.print("Vvedite chislo: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x>0){
            System.out.println("Chilo " + x + " poloschitelnoe");
        } else if (x==0) {
            System.out.println("Chilo " + x + " ravno nully");
        } else {
            System.out.println("Chilo " + x + " otricatelnoe");
        }


    }
}
