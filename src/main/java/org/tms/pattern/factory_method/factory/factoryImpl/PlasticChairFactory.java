package org.tms.pattern.factory_method.factory.factoryImpl;

import org.tms.pattern.factory_method.factory.ChairFactory;
import org.tms.pattern.factory_method.model.Chair;
import org.tms.pattern.factory_method.model.modelImpl.PlasticChair;

public class PlasticChairFactory implements ChairFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
}
