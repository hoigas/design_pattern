package com.example.strategy;

public class GameCharactor {

    //접근점
    WeaponInterface weapon;

    //교환 가능
    public void setWeapon(WeaponInterface weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
           System.out.println("맨손 공격");
        } else {
            //델리게이트
            weapon.attack();
        }
    }
}
