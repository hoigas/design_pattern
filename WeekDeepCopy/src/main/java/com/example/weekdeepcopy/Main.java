package com.example.weekdeepcopy;

public class Main {
    public static void main(String[] args) {
        Cat navi = new Cat();

        navi.setName("navi");
        navi.setAge(new Age());
        navi.getAge().setYear(2013);
        navi.getAge().setAge(2);

//        Cat yo = navi; //Week Copy
//        yo.setName("yo");
        Cat yo = navi.copy(); //Deep Copy (메인 변수 객체 복사)
        yo.setName("yo");
        yo.getAge().setYear(2019);
        yo.getAge().setAge(10); //Deep Copy (서브변수는 복사 안됨 따로 Cloneable 해줘야함)

        System.out.println("navi name : " + navi.getName());
        System.out.println("navi year : " + navi.getAge().getYear());
        System.out.println("navi age : " + navi.getAge().getAge());

        if (yo != null) {
            System.out.println("yo name : " + yo.getName());
            System.out.println("yo year : " + yo.getAge().getYear());
            System.out.println("yo age : " + yo.getAge().getAge());
        }
    }
}
