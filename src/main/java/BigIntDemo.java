package org.edge;
import java.math.BigInteger;
public class BigIntDemo {
    public static void main(String[] args){
        long maxLong = Long.MAX_VALUE;
        long overflowed = maxLong =10;
        System.out.println("Overflowed Lon: "+ overflowed);
        BigInteger bigNum = BigInteger.valueOf(maxLong);
        BigInteger result = bigNum.multiply(BigInteger.valueOf(10));
        System.out.println("BigInterger Result: " + result);
    }
}
//using biggerInteger Limitless
