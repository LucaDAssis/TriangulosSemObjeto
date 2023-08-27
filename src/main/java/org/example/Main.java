package org.example;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measuares of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measuares of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X Area: %.4f%n", areaX);
        System.out.printf("Triangle Y Area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("large Area: X");
        } else {
            System.out.println("large area Y");
        }

        sc.close();
    }
}