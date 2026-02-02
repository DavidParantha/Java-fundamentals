package Encapulation;
public class car {
    final private String name;
    private String noPlate;
    private float mielage;
    public car(String name, String noPlate, float mielage) {
        this.name = name;
        this.noPlate = noPlate;
        this.mielage = mielage;
    }
    public String getName() {
        return name;
    }
    public String getNoPlate() {
        return noPlate;
    }
    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }
    public float getMielage() {
        return mielage;
    }
    public String info() {
        return "Car{" +
                "name='" + name +
                ", noPlate='" + noPlate +
                ", mielage=" + mielage +
                '}';
    }
    public void setMielage(float mielage) {
        this.mielage = mielage;
    }
}


