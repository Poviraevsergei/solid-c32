package org.tms.pattern.factory_method;

import org.tms.pattern.factory_method.factory.ChairFactory;
import org.tms.pattern.factory_method.factory.factoryImpl.PlasticChairFactory;
import org.tms.pattern.factory_method.model.Chair;

public class Main {
    public static void main(String[] args) {
        ChairFactory factory = new PlasticChairFactory();
        Chair chair = factory.createChair();
        
        chair.sitOn();
    }
}
