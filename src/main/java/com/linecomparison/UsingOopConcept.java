package com.linecomparison;

public class UsingOopConcept {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int _x1;
    private int _x2;
    private int _y1;
    private int _y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int get_X1() {
        return _x1;
    }

    public void set_X1(int _x1) {
        this._x1 = _x1;
    }

    public int get_X2() {
        return _x2;
    }

    public void set_X2(int _x2) {
        this._x2 = _x2;
    }

    public int get_Y1() {
        return _y1;
    }

    public void set_Y1(int _y1) {
        this._y1 = _y1;
    }

    public int get_Y2() {
        return _y2;
    }

    public void set_y2(int _y2) {
        this._y2 = _y2;
    }

    @Override
    public String toString() {
        return "Line1 x1 =" + x1 +
                ", Line1 x2 =" + x2 +
                ", Line1 y1 =" + y1 +
                ", Line1 y2 =" + y2 +
                ", Line2 x1 =" + _x1 +
                ", Line2 x2 =" + _x2 +
                ", Line2 y1 =" + _y1 +
                ", Line2 y2 =" + _y2 ;
    }
    public static class Line {
        public static void main(String[] args) {
            UsingOopConcept obj = new UsingOopConcept();
            obj.setX1(6);
            obj.setX2(6);
            obj.setY1(4);
            obj.setY2(8);
            obj.set_X1(8);
            obj.set_X2(9);
            obj.set_Y1(8);
            obj.set_y2(9);
            System.out.println("The co-ordinates are : " + obj.toString());
            int length1 = ((obj.getX2() - obj.getX1()) ^ 2 + (obj.getY2() - obj.getY1()) ^ 2);
            int length2 = ((obj.get_X2() - obj.get_X1()) ^ 2 + (obj.get_Y2() - obj.get_Y1()) ^ 2);
            System.out.println("Length of 1st line = " + length1);
            System.out.println("Length of 2nd line = " + length2);

            //Check equality of two lines
            String l1 = Double.toString(length1);
            String l2 = Double.toString(length2);

            //Comparing two lines
            if (l1.compareTo(l2)>0)
                System.out.println("Line1 is longer than line2");
            else if (l1.compareTo(l2)==0)
                System.out.println("Line1 is equal to line2");
            else
                System.out.println("Line2 is longer than line1");
        }
    }
}
