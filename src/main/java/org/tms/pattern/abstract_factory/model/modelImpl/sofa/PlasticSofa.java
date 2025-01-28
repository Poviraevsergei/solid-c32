package org.tms.pattern.abstract_factory.model.modelImpl.sofa;

import org.tms.pattern.abstract_factory.model.Sofa;

public class PlasticSofa implements Sofa {

    @Override
    public void sitOn() {
        System.out.println("You are sitting on plastic sofa.");
    }
}
