package Encapulation;

public class Mainn {
    public static void main(String[] args) {
        student st1 = new student(3, "John","KTS");
//        System.out.println(st1.name);
//        System.out.println(st1.roll);
//
//        st1.name = "Donkey";
//        System.out.println(st1.name);
//        System.out.println(st1.roll);

        System.out.println(st1.info());
        System.out.println(st1.getName());
        System.out.println(st1.getRoll());

        st1.setRoll(99);

        System.out.println(st1.info());


        //Employee

        employee emp1 = new employee("Sri",234,"Java",true,100000,
                7693764738l);
        System.out.println(emp1.getEmpID());
        System.out.println(emp1.getName());
        System.out.println(emp1.getCompanyName());
        System.out.println(emp1.info());
    }
}
