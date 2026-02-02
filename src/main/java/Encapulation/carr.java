package Encapulation;

public class carr {
    public static void main(String []args){
        car car1=new car("tesla","5370",19);
        System.out.println(car1.getMielage());
        System.out.println(car1.getName());
        System.out.println(car1.getNoPlate());
    }
}
