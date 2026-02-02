package opps.example;

public class Opps {
    public static void main(String[] args) {
        Marker m1 = new Marker();
        Marker m2 = new Marker();
//        Marker m3 = new Marker();
        m2.color = "red";
        System.out.println(m2.brand);
        System.out.println(m2.color);
        System.out.println(m2.price);        //here m is refering for the declared instance varables

        m1.brand = "Luxar";
        m1.color = "green";
        m1.price =  23;
//        m1=null;
        System.out.println(m1.brand);
        System.out.println(m1.color);
        System.out.println(m1.price);
        Marker m3 = m2;
        System.out.println(" "+m3.color);
        System.out.println(m3);
        System.out.println(m3.hashCode());

    }
}
