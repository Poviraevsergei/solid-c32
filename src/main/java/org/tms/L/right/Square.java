package org.tms.L.right;

public class Square {

    private Integer x;
    
    public void setX(Integer x) {
        this.x = x;
    }

    void calculateArea() {
        System.out.println("Square calculation");
        System.out.println(x * x);
    }
}