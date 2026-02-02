package opps.example;

public class Constructor {
    public static void main(String[] args){
        Marker m1 = new Marker();

        System.out.println(m1.price);
        System.out.println(m1.color);
        System.out.println(m1.brand);
        Marker m2=new Marker(35,"Green","USA");
        System.out.println(m2.color);
        System.out.println(m2.hashCode());
        System.out.println(m2.returnMe().hashCode());

    }
}
