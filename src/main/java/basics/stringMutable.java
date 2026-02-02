package basics;

public class stringMutable {
    public static void main(String[] args){
        String s1 = "Hello";
        long start = System.nanoTime();
        for(int i=0;i<10;i++){
//            s1 +=" World";
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            System.out.println(sb);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
