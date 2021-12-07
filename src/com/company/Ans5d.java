package com.company;
import java.util.*;
public class Ans5d {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of times for row : ");
        int number=sc.nextInt();
        System.out.print("Enter Symbol of which you want to  print : ");

        char c = sc.next().charAt(0);

        for(int i=number;i>0 ;i--)
        {
            for(int j=0;j<number-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)-1;j++)

            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}