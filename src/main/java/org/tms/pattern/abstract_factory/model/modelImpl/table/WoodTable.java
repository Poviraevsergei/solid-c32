package org.tms.pattern.abstract_factory.model.modelImpl.table;

import org.tms.pattern.abstract_factory.model.Table;

public class WoodTable implements Table {

    @Override
    public void sitInTo() {
        System.out.println("You are sitting in to wood table.");
    }
}
