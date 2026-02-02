package Strings;

import java.util.StringJoiner;

public class JoinerExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("grape");
        String str = "grape";

        if (str.equals(sb.toString())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        StringJoiner sj = new StringJoiner(",");

        sj.add("Apple");
        sj.add("Banana");
        sj.add("Grape");

        System.out.println(sj);
    }
}
