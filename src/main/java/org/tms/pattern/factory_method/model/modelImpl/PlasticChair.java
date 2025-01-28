package org.tms.pattern.factory_method.model.modelImpl;

import org.tms.pattern.factory_method.model.Chair;

public class PlasticChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("You are sitting on plastic chair.");
    }
}
