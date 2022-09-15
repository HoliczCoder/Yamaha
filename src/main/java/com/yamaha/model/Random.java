//package com.yamaha.model;
//
//class Random {
//
//    private int a;
//    private float b;
//
//    Random() { System.out.println("Calling The Constructor"); }
//
//    Random setint(int a)
//    {
//        this.a = a;
//        return this.a;
//    }
//
//    Random setfloat(float b)
//    {
//        this.b = b;
//        return this.b;
//    }
//
//    Random display()
//    {
//        System.out.println("Display=" + a + " " + b);
//    }
//}
//
//// Driver code
//public class Example {
//    public static void main(String[] args)
//    {
//        // This will return an error as
//        // display() method needs an object but
//        // setint(10) is returning an int value
//        // instead of an object reference
//        new Random().setint(10).display().;
//    }
//}