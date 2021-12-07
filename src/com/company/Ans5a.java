package com.company;
import java.util.*;
public class Ans5a
{
    public static void main(String[] args){
    int rows,columns;//declare variable size
    Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of rows: ");
    rows=scan.nextInt();

System.out.println("Enter the number of columns: ");
    columns=scan.nextInt();

for (int i=1; i<=rows; i++){
    for (int j=1; j<=columns; j++){
        if(i==1||i==rows||j==1||j==columns){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }

    }
    System.out.print("\n");
}
}
}