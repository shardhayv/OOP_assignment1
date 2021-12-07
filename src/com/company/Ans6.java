package com.company;
import java.util.*;
public class Ans6 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            double num1 = in.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = in.nextDouble();
            System.out.println("Enter the third number: ");
            double num3 = in.nextDouble();
            if (num1 < num2 && num2 < num3)
            {
                System.out.println("Entered numbers are in Increasing order");
            }
            else if (num1 > num2 && num2 > num3)
            {
                System.out.println("Entered numbers are in Decreasing order");
            }
            else
            {
                System.out.println("Entered numbers are Neither increasing nor decreasing order");
            }
        }
    }
