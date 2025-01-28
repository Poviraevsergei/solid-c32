package org.tms.pattern.abstract_factory.factory;

import org.tms.pattern.abstract_factory.model.Chair;
import org.tms.pattern.abstract_factory.model.Sofa;
import org.tms.pattern.abstract_factory.model.Table;

public interface Factory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
