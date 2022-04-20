package com.company;

class Shape {
    int side;
    float length,breadth;
    double radius;

    Shape(int s) {
        side = s;
        length = 0;
        breadth = 0;
        radius = 0;
    }

    Shape(int l, int b) {
        length = l;
        breadth = b;
        radius = 0;
    }

    Shape(double r) {
        radius = r;
        length = 0;
        breadth = 0;
    }

    void area(int l) {
        System.out.println(l*l);
    }

    void area(float l, float b) {
        System.out.println(l*b);
    }

    void area(double r) {
        System.out.println(3.142*r*r);
    }
}

public class shapes {
    public static void main(String[] args) {
        Shape sq = new Shape(4);
        System.out.println("Area of square:");
        sq.area(sq.side);

        Shape rc = new Shape(5,6);
        System.out.println("Area of rectangle:");
        rc.area(rc.length,rc.breadth);

        Shape cc = new Shape(7.1);
        System.out.println("Area of circle:");
        cc.area(cc.radius);
    }
}
