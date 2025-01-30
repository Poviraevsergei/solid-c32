package org.tms.pattern.facade;

public class ComputerFacade {
    private final Power power;
    private final HardDisk hardDisk;
    private final CdRom cdRom;

    public ComputerFacade() {
        this.power = new Power();
        this.hardDisk = new HardDisk();
        this.cdRom = new CdRom();
    }

    public Power getPower() {
        return power;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public CdRom getCdRom() {
        return cdRom;
    }
    
    void copyInfoFromCdToHardDisk(){
        power.on();
        cdRom.open();
        cdRom.close();
        hardDisk.copyInfoFromCd();
        power.off();
    }
}
