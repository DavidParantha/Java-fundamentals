package opps.example.array.one_d;

import Strings.StringIntro;

import java.util.Arrays;

public class Arrofobj {
    public static void main(String[] args) {
        String[] arr = {"sdds", "dfjf", "mdmd", "adiv"};
        String[] strArr = new String[5];
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(strArr));
    }

    Student[] Student = {

            new Student(3, "ssds"),
            new Student(4, "dfjf"),
            new Student(2, "mdmd"),
            new Student(1, "adiv")

    };
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
