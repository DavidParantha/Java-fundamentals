package Abstraction.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exce1 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 43, 5, 6, 0};
        try {
        int num = sc.nextInt();
            System.out.println(10 / arr[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occurred o");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Exception Occurred");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
        System.out.println("end");
        sc.close();
    }
}
