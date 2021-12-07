package com.company;

import java.util.Scanner;

public class Ans8 {
    public static void calculateBMI() {
        Scanner sc = new Scanner(System.in);

        float weight;
        float height;
        float bmi;

        System.out.print("Input mass  in kg : ");
        weight = sc.nextFloat();

        System.out.print("Input height in meter : ");
        height = sc.nextFloat();

        bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi + " kg/m2");

    }


    public static void main(String[] args) {
        calculateBMI();
    }
}
