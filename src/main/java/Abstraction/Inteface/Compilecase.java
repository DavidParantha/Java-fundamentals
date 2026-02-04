package Abstraction.Inteface;

public interface Compilecase {

    static void call(){
        System.out.println("Comlex Case");
    }

    static void call1(){
        System.out.println("Comlex Case");
    }
    default void ring(){
        System.out.println("Ringing...");
    }
}

//static funtion are allowed