package com.example.strategy;

public class SwordImpl implements WeaponInterface {
    @Override
    public void attack() {
        System.out.println("검 공격");
    }
}
