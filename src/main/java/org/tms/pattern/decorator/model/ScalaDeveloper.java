package org.tms.pattern.decorator.model;

public class ScalaDeveloper implements Developer {
    @Override
    public void showSkill() {
        System.out.println("I can write Scala code ...");
    }
}
