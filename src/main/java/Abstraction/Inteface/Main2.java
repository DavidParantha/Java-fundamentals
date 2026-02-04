package Abstraction.Inteface;

public class Main2 {
    public static void main(String[] args) {
        LoksabhaImpl l1 = new LoksabhaImpl();
        l1.elect(24);
        l1.locationofLoksabha();
        Loksabha l2 = new Loksabha() {
            @Override
            public void elect(int candidates) {
                System.out.println("Election is near");
            }
        };
        l2.elect(24);
        l2.locationofLoksabha();
        Loksabha l3=(candidates)-> {
            System.out.println("Election is live");
        };
    }
}

