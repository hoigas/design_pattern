package com.example.strategy;

public class Main {
    public static void main(String[] args) {
        AInterface aInterface = new AInterfaceImpl();
        //통로
        aInterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();

        //-------------GameCharacter------------
        GameCharactor charactor = new GameCharactor();
        charactor.attack(); //맨손 공격
        charactor.setWeapon(new KnifeImpl());
        charactor.attack(); //나이프 공격
        charactor.setWeapon(new SwordImpl());
        charactor.attack(); //검 공격
        charactor.setWeapon(new AxImpl());
        charactor.attack(); //도끼 공격
    }
}