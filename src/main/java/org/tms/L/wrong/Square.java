package org.tms.L.wrong;

public class Square extends Rectangle {

    @Override
    public void setX(Integer x) {
        super.setX(x);
        super.setY(x);
    }

    @Override
    public void setY(Integer y) {
        super.setX(y);
        super.setY(y);
    }
}