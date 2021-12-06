package com.company;

import java.util.*;

class Ans4 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap :");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            number = Integer.parseInt(temp);
            System.out.println(number);
            sum = sum + number;
        }
        System.out.println("Sum of all the entered integer is : " + sum);
        sc.close();
    }
}
