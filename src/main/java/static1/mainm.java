package static1;

import Encapulation.student;

public class mainm {
    public static void main(String[] args){
//        Statickeyword st1=new Statickeyword(23,"john","lpu");
//        System.out.println(st1.info());
//        System.out.println(st1.collgeName);
//
//        Statickeyword st2=new Statickeyword(23,"joe","nit");
//        System.out.println(st2.info());
//        System.out.println(st2.collgeName);
        System.out.println(Statickeyword.collgeName);
        Statickeyword st1=new Statickeyword(23,"jane","vit");
        System.out.println(st1.info());
        System.out.println(st1.collgeName);

        System.out.println(Statickeyword.collgeName);

        System.out.println(st1.collgeName);


    }
}
