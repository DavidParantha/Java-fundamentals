package Abstraction.Inteface;

public class ConflictMethods {
    interface InterfaceA{
        default void sayHello(){
            System.out.println("Hello from A");
        }
        interface InterfaceB{
            default void sayHello(){
                System.out.println("Hello from B");

            }
            class Myclass implements InterfaceA,InterfaceB{
                @Override
                public  void sayHello(){
                    System.out.println("Hello fromm Myclass");
                    InterfaceA.super.sayHello();
                    }

                }
            }
        }
    }

