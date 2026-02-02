package opps.example.inheritance;

public class inheritanceMain {
    public static void main(String[] args) {
        footballu ronldo = new footballu("Ronldo", 40, 24, 256, 790,
                7, false, Gender.MALE);
            System.out.println(ronldo.name);
        System.out.println("age:"+ronldo.age);
        System.out.println("experience:"+ronldo.experience);
        System.out.println("matches:"+ronldo.matchesplayed);
        System.out.println("goal:"+ronldo.goal);
        System.out.println("jersey:"+ronldo.jerseyNon);
        System.out.println("captain:"+ronldo.isCaptain);
//        System.out.println("payment:"+ronldo.payment);
        }
    }
