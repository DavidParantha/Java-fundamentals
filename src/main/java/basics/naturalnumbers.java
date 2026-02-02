package basics;
    import java.util.Scanner;
public class naturalnumbers {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int num = 0;
        int num = sc.nextInt();
        if(num>=0) {
            System.out.println("num is Natural Number: ");
        }else{
            System.out.println("num is not Natural Number");

        }
    }
}
