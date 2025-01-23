package org.tms.I.wrong;

public class Ironman implements Skill {
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
