package Abstraction.Inteface;
public interface InterfaceM {
    void call();
}
interface InterfaceN{
    void hang();
}
interface InterfaceFusion extends InterfaceM,InterfaceN {
    void ring();
}
abstract class  classA implements InterfaceFusion{
 void text(){

 }
}
class ClassA implements InterfaceFusion {

    @Override
    public void call() {
        System.out.println("calling...");
    }
    @Override
    public void hang() {
        System.out.println("hanging up...");
    }
    @Override
    public void ring() {
        System.out.println("ringing...");
    }
}



