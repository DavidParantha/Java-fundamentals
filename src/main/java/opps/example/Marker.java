package opps.example;

public class Marker {
    // instance varbles are which are declared inside the classs
    int price;
    String color;
    String brand;
    Marker() {
//        this(5,"noob"); avoid cyclic recursive construtor call
        System.out.println("Marker() called");
    }

    Marker(int price, String color, String brand) {
        this();
        System.out.println("Marker(int price, String color,String brand) called");
        this.price = price;
        this.color = color;
        this.brand = brand;
        System.out.println(price);
        System.out.println(color);
        System.out.println(brand);
    }

    void write() {
        System.out.println("writing with a" + color + "ink");
    }

    void throwing() {
        System.out.println("throwing a Marker");
}
    Marker returnMe(){
        return this;
    }
}
