package Abstraction.Inteface;
@FunctionalInterface
public interface Loksabha {

    void elect(int candidates);
    static void members(){System.out.println("there are"+345+"members in lokasabha");}
    default void locationofLoksabha() {System.out.println("Location is Mubai");
        }
    }
