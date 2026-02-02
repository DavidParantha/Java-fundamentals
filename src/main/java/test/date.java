package test;

import java.util.Scanner;

public class date {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("DD - YY - YYYY");
        String DD =sc.nextLine();
        String YY=sc.nextLine();
        String yyyy =  sc.nextLine();
        int l= Integer.parseInt(yyyy);

        System.out.println("  " + DD + " - " + YY + " - " + yyyy);
        if((l % 4 == 0 && l % 100 != 0 || (l % 400 ==0))) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
