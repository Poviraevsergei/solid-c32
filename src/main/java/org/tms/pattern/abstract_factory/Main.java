package org.tms.pattern.abstract_factory;

import org.tms.pattern.abstract_factory.factory.Factory;
import org.tms.pattern.abstract_factory.factory.factoryImpl.WoodFactory;
import org.tms.pattern.abstract_factory.model.Chair;
import org.tms.pattern.abstract_factory.model.Sofa;
import org.tms.pattern.abstract_factory.model.Table;

public class Main {
    public static void main(String[] args) {
        Factory factory = new WoodFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        Sofa sofa = factory.createSofa();
        
        chair.sitOn();
        table.sitInTo();
        sofa.sitOn();
    }
}
