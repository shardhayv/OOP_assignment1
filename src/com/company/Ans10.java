package com.company;

import java.util.Scanner;

public class Ans10 {
    public static void checkArmstrong() {

        int user_input;
        int original_input;
        int armstrong = 0;
        int last_digit;
        int cube_digit = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        user_input = sc.nextInt();

        original_input = user_input;


        while (user_input > 0) {
            last_digit = user_input % 10;
            cube_digit += (int) Math.pow(last_digit, 3);
            armstrong = +cube_digit;
            user_input = user_input / 10;

        }

        if (armstrong == original_input) {
            System.out.println(original_input + " is an armstrong number.");
        } else {
            System.out.println(original_input + " is not an armstrong number.");
        }

    }


    public static void main(String[] args) {
        checkArmstrong();
    }
}

