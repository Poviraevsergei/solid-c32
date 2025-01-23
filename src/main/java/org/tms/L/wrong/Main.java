package org.tms.L.wrong;

public class Main {
    public static void main(String[] args) {
        Rectangle figure = new Square();
        //изменяем стороны
        figure.setX(1);
        figure.setY(5);
        figure.calculateArea();
    }
}
