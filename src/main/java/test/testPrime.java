package test;
import java.util.Scanner;
public class testPrime {
        public static void main(String[] args){
//        Print prime numbers from 1 to n.
            int count=0;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=2;i<=n;i++) {
                boolean x = true;
                for (int j = 2; j * j<= i; j++) {
                    if (i  % j == 0) {
                        x = false;
                        break;
                    }
                }
                if(x==true){
                        count++;
                        System.out.println(i);
                    }
                }
            }
        }

