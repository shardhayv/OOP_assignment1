package com.company;

import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {
        int num;
        int prime;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=s.nextInt();
        for(int i=2;i<num;i++)
        {
            prime=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    prime=1;
            }
            if(prime==0)
                System.out.println(i);
        }
    }
}
