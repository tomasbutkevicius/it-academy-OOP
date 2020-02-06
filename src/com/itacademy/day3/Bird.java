package com.itacademy.day3;

public class Bird implements Animal {

    @Override
    public void eat() {

    }

    @Override
    public void travel(int distance) {
        System.out.println("distance traveled: "+Integer.toString(distance));
    }
}
