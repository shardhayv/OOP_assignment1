package com.company;

public class Ans5b {
    public static void main(String[] args) {

        int rows = 5, j = 0;

        for (int i = 1; i <= rows; ++i, j = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (j != 2 * i - 1) {
                System.out.print("* ");
                ++j;
            }

            System.out.println();
        }
    }
}