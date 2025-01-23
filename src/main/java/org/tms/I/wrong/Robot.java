package org.tms.I.wrong;

public class Robot implements Skill {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void eat() {

    }

    @Override
    public void speak() {
        System.out.println("I'm speaking");
    }
}
