package opps.example.inheritance;
public class Animal {
    String name;
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.run();
        tiger.name="Bengal Tiger";
        tiger.age=22;
        System.out.println(tiger);
    }
    //overiding
    void run() {
        System.out.println("Animal is running");
    }
}
    class Tiger extends Animal {
    int age;
    @Override
    void run() {
        System.out.println("Tiger");
    }
        @Override
        public String toString() {
            return "Tiger{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

