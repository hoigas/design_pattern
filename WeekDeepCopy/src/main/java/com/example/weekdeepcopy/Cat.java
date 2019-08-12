package com.example.weekdeepcopy;

public class Cat implements Cloneable {
    private String name;
    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Cat copy() {
        try {
            Cat copyCat = (Cat)this.clone();
            Age copyAge = this.getAge().copy();
            if (copyAge != null) {
                copyCat.setAge(copyAge);
            }
            copyCat.setAge(this.getAge().copy());
            return copyCat;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
