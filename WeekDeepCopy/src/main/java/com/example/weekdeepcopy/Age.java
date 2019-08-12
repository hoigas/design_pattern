package com.example.weekdeepcopy;

public class Age implements Cloneable {
    private int year;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Age copy() {
        try {
            return (Age)this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
