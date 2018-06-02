package com.integrate.dogservice.rest;

import java.util.Objects;

public class Dog {

    private long id;
    private int legs;
    private String name;
    private int age;

    public long getId() {
        return id;
    }

    public int getLegs() {
        return legs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog(long id, int legs, String name, int age) {
        this.id = id;
        this.legs = legs;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return id == dog.id &&
                legs == dog.legs &&
                age == dog.age &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, legs, name, age);
    }
}
