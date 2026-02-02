package basics;

public class palindrome {
    public static void main(String[] args) {

        String s4 = "RaDaR";
        s4 = s4.toLowerCase();
        String rev = "";
        for (int i = s4.length() - 1; i >= 0; i--) {
            rev = rev + s4.charAt(i);
        }
        if (s4.equals(rev)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


