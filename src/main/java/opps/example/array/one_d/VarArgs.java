//package opps.example.array.one_d;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] David){
        System.out.println(David.length);
        System.out.println(Arrays.toString(David));
        new VarArgs().callMe(3,89,9);
    }
//    private void callme(int x,int y) {
//    }
    private void callMe(int ... x){
        System.out.println(x.length);
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}
