package org.tms.solid.L.wrong;

public class Rectangle {
    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    void calculateArea() {
        System.out.println("Rectangle calculation");
        System.out.println(x * y);
    }
}
