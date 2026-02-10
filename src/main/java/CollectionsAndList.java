package org.edge.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsAndList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(21);
            add(12);
            add(32);
            add(4);

        }};
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list);
        System.out.println(list2);
        list.replaceAll(x -> x * 2);
        System.out.println(list);

            ArrayList<Student> listofStudent = new ArrayList<>();
        listofStudent.add(new Student("jhon",20));
        listofStudent.add(new Student("jane",21));
        listofStudent.add(new Student("jack",22));
        listofStudent.add(new Student("jall",23));
        listofStudent.stream().forEach(System.out::println)
        System.out.println(listofStudent);
        System.out.println();


    }
    }
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return   name + " " + age ;
    @Override
        public int compare(Student str1){
        if(str1.age == this.age){
            else if(str1.age<this.age) {
                return 1;
            }else{
                return -1;
            }
        }
        }

 }
}


