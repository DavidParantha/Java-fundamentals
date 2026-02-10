package org.edge;

public class SecondHighestNumberArray {
    public static void main(String[] args) {
        int[] num = {58, 79, -98, 67, 899, 98};
        int high = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > high) {
                secondHigh = high;
                high = num[i];
            } else if (num[i] > secondHigh && num[i] != high) {
                secondHigh = num[i];
            }
        }
        System.out.println("Highest number: " + high);
        System.out.println("Second highest number: " + secondHigh);

    }
}
