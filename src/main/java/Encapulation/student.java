package Encapulation;

public class student {
    private int roll;
    private String name;
    String collageName;
    public student(int roll, String name, String collageName) {
//        String collageName;
        this.roll = roll;
        this.name = name;
        this.collageName= collageName;
    }
    public int getRoll() {
        return roll;
    }
    public String getCollageName() {
        return collageName;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }
    public String info() {
        return "Roll: " + roll + ", Name: " + name+ " clg:"+collageName;
    }
}
