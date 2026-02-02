package static1;

public class Statickeyword {
     int id;
     String name;
     static String collgeName;
     static {
         System.out.println("static 1 block excuted");
         collgeName="IIT";
     }

    {
        System.out.println("Normal Block 1");
    }
    static {
         System.out.println("static block 2");
    }
    static {
         System.out.println("Normal 2 blocks excuted");
    }
    public Statickeyword(int id, String name,String collge) {
        this.id = id;
        this.name = name;
        collgeName=collge;
    }
    public String info() {
        return "statickeyword{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "clg"+ collgeName+
                '}';
    }
}
