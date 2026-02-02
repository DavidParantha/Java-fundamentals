package basics;

import java.util.Scanner;

public class ABc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch= (char) ('a' + j-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
