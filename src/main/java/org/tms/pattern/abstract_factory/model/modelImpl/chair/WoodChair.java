package org.tms.pattern.abstract_factory.model.modelImpl.chair;

import org.tms.pattern.abstract_factory.model.Chair;

public class WoodChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("You are sitting on wood chair.");
    }
}
