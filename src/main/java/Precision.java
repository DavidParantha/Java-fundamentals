package org.edge;

import java.math.BigDecimal;
public class Precision {

    public static void main(String[] args) {

        double value = 1.00;
        for (int i = 1; i <= 10; i++) {
            value -= 0.10;
        }
        System.out.println(value);   // shows precision error

        BigDecimal balanceBD = new BigDecimal("1.00");
        BigDecimal step = new BigDecimal("0.10");

        for (int i = 1; i <= 10; i++) {
            balanceBD = balanceBD.subtract(step);
        }

        System.out.println(balanceBD);   // exact result: 0.00
    }
}
