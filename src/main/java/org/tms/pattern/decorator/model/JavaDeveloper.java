package org.tms.pattern.decorator.model;

public class JavaDeveloper implements Developer {
    @Override
    public void showSkill() {
        System.out.println("I can write Java code ...");
    }
}
