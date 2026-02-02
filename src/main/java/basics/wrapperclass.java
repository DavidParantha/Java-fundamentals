package basics;

public class wrapperclass {
    public static void main(String[] args){
        int x =10;
        Integer x_= new Integer(x);
        Boolean bool_ = new Boolean(false);
        Boolean bool2 = false;
        System.out.println(x);
        System.out.println(bool_);
        int y=193;
        Integer y_=y; //autoboxing
        int z=y; //autounboxing
    }
}
