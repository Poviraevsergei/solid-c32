package org.tms.pattern.decorator;

import org.tms.pattern.decorator.model.Developer;

public class Decorator implements Developer {
    private final Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void showSkill() {
        developer.showSkill();
    }
}
