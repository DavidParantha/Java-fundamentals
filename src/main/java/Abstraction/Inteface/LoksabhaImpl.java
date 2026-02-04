package Abstraction.Inteface;

public class LoksabhaImpl implements Loksabha {
    @Override
    public void elect(int candidates){
        System.out.println("Election is coming for selected candidates: "+candidates);
    }
}
