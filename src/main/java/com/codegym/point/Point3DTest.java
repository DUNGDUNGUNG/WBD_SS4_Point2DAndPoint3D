package com.codegym.point;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1= new Point3D(3,3,3);
        System.out.println(point3D1);

        point3D.setZ(6);
        System.out.println("z: " + point3D.getZ());

        point3D.setXYZ(9,9,9);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
