package org.tms.O.right;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Circle circle = new Circle();
        double res = calculator.calculateShapeArea(circle);
    }
}
