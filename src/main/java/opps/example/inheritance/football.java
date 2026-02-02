package opps.example.inheritance;

public class football extends player {
    int goal;
    int jerseyNon;
    boolean isCaptain;

    public football(String name, Gender gender, int matchesplayed, int experience,
                    int age, int goal, int jerseyNon, boolean isCaptain) {
        super(name, gender, matchesplayed, experience, age);
        this.goal = goal;
        this.jerseyNon = jerseyNon;
        this.isCaptain = isCaptain;
    }
}
