package basics;

import java.util.Scanner;

public class pat22 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

//package basics;
//
//import java.util.Scanner;
//import java.util.*;
//public class pat22 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }
//}
