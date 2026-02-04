package static1;
import java.util.Scanner;
public class armstrong {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }
        public static boolean isArmstrong(int num) {
            int n = (num == 0) ? 1 : (int) Math.log10(num) + 1;
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digits = temp % 10;
                sum += (int) Math.pow(digits, n);
                temp /= 10;
            }
            return sum == num;
        }
    }
