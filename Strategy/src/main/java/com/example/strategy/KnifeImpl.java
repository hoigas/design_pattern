package com.example.strategy;

public class KnifeImpl implements WeaponInterface {
    @Override
    public void attack() {
        System.out.println("칼 공격");
    }
}
