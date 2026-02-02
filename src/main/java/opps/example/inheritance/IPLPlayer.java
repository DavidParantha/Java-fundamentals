package opps.example.inheritance;

public class IPLPlayer extends player {
    int runs;
    int jerseyNon;
    boolean isAllrounder;
    boolean isCaptain;
//    long payment=10000l;
    public IPLPlayer(String name, Gender gender, int matchesplayed, int experience, int age, int runs, int jerseyNon,
                     boolean isAllrounder, boolean isCaptain) {
        super(name, gender, matchesplayed, experience, age);

        this.runs = runs;
        this.jerseyNon = jerseyNon;
        this.isAllrounder = isAllrounder;
        this.isCaptain = isCaptain;
    }
    //dont put super  and this in same constructor they will fight for 1st poistion
//        this(name,age,experience,matchesplayed,gender);

    void averaage() {
        System.out.println("Average : " + (runs / matchesplayed));
    }


    public String info() {
        return "IPLPlayer{" +
                "name='" + name +
                ", age=" + age +
                ", runs=" + runs +
                ", jerseyNon=" + jerseyNon +
                ", experience=" + experience +
                ", matchesplayed=" + matchesplayed +
                ", isAllrounder=" + isAllrounder +
                ", isCaptain=" + isCaptain +
                ", gender=" + gender +
                '}';
    }
}

