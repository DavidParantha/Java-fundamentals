package opps.example.inheritance;

public class player {
    String name;
    int age;
    int experience;
    int matchesplayed;
    Gender gender;
    long payment=10000L;

    public player(String name, Gender gender, int matchesplayed, int experience, int age) {
        this.name = name;
        this.gender = gender;
        this.matchesplayed = matchesplayed;
        this.experience = experience;
        this.age = age;

    }


    public String info() {
        return "player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchesplayed=" + matchesplayed +
                ", gender=" + gender +
                '}';
    }
}
