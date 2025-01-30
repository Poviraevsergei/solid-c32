package org.tms.pattern.facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.copyInfoFromCdToHardDisk();
    }
}
