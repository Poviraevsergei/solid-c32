package org.tms.pattern.decorator.skill;

import org.tms.pattern.decorator.Decorator;
import org.tms.pattern.decorator.model.Developer;

public class DatabaseSkill extends Decorator {
    public DatabaseSkill(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("I can use databases ..");
    }
}
