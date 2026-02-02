package opps.example.inheritance;

class Animals{
    boolean isExtinct;
    void eat() {
        System.out.println("this animal eats");
    }
}
class Bird extends Animals {
    int wingspan;
    void fly() {
        System.out.println("this bird is flying high!");
    }
}
public class upcasting {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.eat();                 // from Animals
        b1.fly();                 // from Bird
//        System.out.println(b1.wingspan);   // Bird variable (0)
//        System.out.println(b1.isExtinct);  // Animals variable (false)
        Animals a3 = new Bird();
        a3.eat();
        System.out.println(a3.isExtinct);
        if (a3 instanceof Bird) {
            Bird b2 = (Bird) a3;
            b2.fly();
            b2.eat();
            System.out.println("this animal can fly");
        }else {
            System.out.println("this animal cannot fly");
        }
    }
}

