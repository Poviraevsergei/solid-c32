package org.tms.I.right;

public class Ironman implements Eatable, Flyable, Speakable {
    @Override
    public void fly() {
        System.out.println("Ironman fly");
    }

    @Override
    public void eat() {
        System.out.println("Ironman eat");
    }

    @Override
    public void speak() {
        System.out.println("Ironman speak");
    }
}
