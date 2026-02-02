package org.example;

import java.util.Scanner;

public class statement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Year: ");
        int Year= sc.nextInt();
        if((Year % 4==0 && Year % 100 == 0 || (Year%400!=0))){
             System.out.println("LeapYear");
        }else {
            System.out.println("NonLeapYear");
        }
    }
}
