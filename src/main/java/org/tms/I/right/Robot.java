package org.tms.I.right;

public class Robot implements Flyable, Speakable {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void speak() {
        System.out.println("I'm speaking");
    }
}
