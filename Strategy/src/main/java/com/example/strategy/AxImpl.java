package com.example.strategy;

public class AxImpl implements WeaponInterface {
    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }
}
