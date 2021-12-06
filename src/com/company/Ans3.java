package com.company;
import java.util.Scanner;
public class Ans3
{
    public static void main(String[] args)
    {
        int num;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of names you want to enter:");
        num = s.nextInt();
        String names[] = new String[num];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < num; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < num; i++)
        {
            for (int j = i + 1; j < num; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Name is sorted in Ascending order:");
        for (int i = 0; i < num - 1; i++)
        {
            System.out.println(names[i] + ",");
        }
        System.out.print(names[num - 1]);
    }
}