package com.company;

public class Circle {

    private static final double pi = 3.14d;


    public static void area (int rad){

        System.out.println(pi * (rad * rad));
    }

    public static void circumference (int rad){

        System.out.println(pi * 2 * rad);
    }

}
