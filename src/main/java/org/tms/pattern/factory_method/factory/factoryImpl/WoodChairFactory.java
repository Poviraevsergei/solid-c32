package org.tms.pattern.factory_method.factory.factoryImpl;

import org.tms.pattern.factory_method.factory.ChairFactory;
import org.tms.pattern.factory_method.model.Chair;
import org.tms.pattern.factory_method.model.modelImpl.WoodChair;

public class WoodChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }
}
