package basics;

public class stringMethods {
    public static void main(String[] args) {

        String s1 = "apple";
        String s3 = " Apple ";

        s3 = s3.trim();
        s3 = s3.toLowerCase();
        System.out.println(s3);
        s3 = s3.toUpperCase();
        System.out.println(s3);
        s3 = "hello Kitty";
        char ch = s3.charAt(0);
        System.out.println(s3.charAt(s3.length()-1));
        String s4 = "apple";
        s4=s4.concat("grape");
        System.out.println(s4);
        s3+=" lichi";
        System.out.println(s3);
        String str = 4343 + 89 - 67 + "" + 87 + 10;
        System.out.println(str);
        str = "apple is gud";
        System.out.println(str.startsWith("sp"));
        System.out.println(str.toLowerCase().endsWith("ud".toLowerCase()));
        str = "aplerfjgr";
        int index = str.indexOf("gr");
//        int index = str.lastIndexOf("gr");
        System.out.println(index);
        str = "appleple";
        System.out.println(str.substring(1,5));
        System.out.println(str.substring(4,8));
        System.out.println(str.substring(8));
        String s5 = "RaDaR";

        System.out.println(str.substring(0,5));

        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("Similar");
        } else {
            System.out.println("Not Similar");
        }
    }
}



