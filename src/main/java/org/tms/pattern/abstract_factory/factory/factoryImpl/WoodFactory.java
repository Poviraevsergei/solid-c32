package org.tms.pattern.abstract_factory.factory.factoryImpl;

import org.tms.pattern.abstract_factory.factory.Factory;
import org.tms.pattern.abstract_factory.model.Chair;
import org.tms.pattern.abstract_factory.model.Sofa;
import org.tms.pattern.abstract_factory.model.Table;
import org.tms.pattern.abstract_factory.model.modelImpl.chair.WoodChair;
import org.tms.pattern.abstract_factory.model.modelImpl.sofa.WoodSofa;
import org.tms.pattern.abstract_factory.model.modelImpl.table.WoodTable;

public class WoodFactory implements Factory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }

    @Override
    public Sofa createSofa() {
        return new WoodSofa();
    }
}
