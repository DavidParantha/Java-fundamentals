package opps.example.inheritance;

public class StaticAndInherite {
    public static void main(String[] args) {

        Sample2 sample2 = new Sample2();

        System.out.println(sample2.x);
        System.out.println(sample2.x);
        System.out.println(sample2.x);
        sample2.callMe();
    }
}
class Sample1 {
    static int x = 9;

    static void callMe() {
        System.out.println("Calling from Static 1");
    }
}
class Sample2 extends Sample1 {
    static void callMe() {
        System.out.println("Calling from Static 2");
    }
}
