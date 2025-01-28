package org.tms.pattern.abstract_factory.factory.factoryImpl;

import org.tms.pattern.abstract_factory.factory.Factory;
import org.tms.pattern.abstract_factory.model.Chair;
import org.tms.pattern.abstract_factory.model.Sofa;
import org.tms.pattern.abstract_factory.model.Table;
import org.tms.pattern.abstract_factory.model.modelImpl.chair.PlasticChair;
import org.tms.pattern.abstract_factory.model.modelImpl.sofa.PlasticSofa;
import org.tms.pattern.abstract_factory.model.modelImpl.table.PlasticTable;

public class PlasticFactory implements Factory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Sofa createSofa() {
        return new PlasticSofa();
    }
}
