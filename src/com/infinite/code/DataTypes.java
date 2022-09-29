package com.infinite.code;

import com.infinite.code.ForLoopExample;

public class DataTypes {
    public static void main(String[] args) {

        ForLoopExample obj1 = new ForLoopExample();
        obj1.MultiDimensionArray();

        int a = 10;
        Integer obj = a; //boxing
        int g =obj;  //unboxing
       // char c = 'r';
        char c = 66;
        int r = (int)c;
        System.out.println(c);
        System.out.println("r = " + r);
        double d = 3.14D;
        Double d1 = d;

        boolean t = true;

        String s1 = "Hello";
        s1="1";
        System.out.println(s1);
    }
}
