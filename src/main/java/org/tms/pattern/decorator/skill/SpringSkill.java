package org.tms.pattern.decorator.skill;

import org.tms.pattern.decorator.Decorator;
import org.tms.pattern.decorator.model.Developer;

public class SpringSkill extends Decorator {
    public SpringSkill(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("I can use Spring framework ..");
    }
}
