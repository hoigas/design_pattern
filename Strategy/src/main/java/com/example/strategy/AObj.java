package com.example.strategy;

public class AObj {

    AInterface aInterface;

    public AObj() {
        this.aInterface = new AInterfaceImpl();
    }

    public void funcAA() {
        //위임한다
        aInterface.funcA();
        aInterface.funcA();

//        System.out.println("AAA");
//        System.out.println("AAA");

        //~ 기능이 필요합니다. 개발해주세요.
    }
}
