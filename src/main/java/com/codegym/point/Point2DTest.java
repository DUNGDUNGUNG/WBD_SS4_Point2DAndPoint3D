package com.codegym.point;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        Point2D point2D1 = new Point2D(4,5);
        System.out.println(point2D1);

        point2D.setX(6);
        point2D.setY(8);
        System.out.println("x: "+point2D.getX()+ ", y: "+point2D.getY());
        point2D.setXY(7,7);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
