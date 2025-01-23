package org.tms.O.wrong;

public class AreaCalculator {
    public double calculateArea(String shapeType, double ... parameters){
        switch (shapeType){
            case "circle": return 1;
            case "square": return 1;
            case "rectangle": return 1;
            default: return 0;
        }
    }
}
