package opps.example.inheritance;

public class footballu {
    String name;
    int age;
    int experience;
    int matchesplayed;
    int goal;
    int jerseyNon;
    boolean isCaptain;
    Gender gender;

    public footballu(String name, int age, int experience, int matchesplayed, int goal,
                     int jerseyNon, boolean isCaptain, Gender gender) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.matchesplayed = matchesplayed;
        this.goal = goal;
        this.jerseyNon = jerseyNon;
        this.isCaptain = isCaptain;
        this.gender = gender;
    }


    public String info() {
        return "footballu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchesplayed=" + matchesplayed +
                ", goal=" + goal +
                ", jerseyNon=" + jerseyNon +
                ", isCaptain=" + isCaptain +
                ", gender=" + gender +
                '}';
    }
}
