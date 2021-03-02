package com.firstjava;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {
//    public = accessible throughout the program
//    void = method won't return a value
    public static void main(String[] args) {
	// write your code here

//  ----- Printing something -----
        System.out.println("Hello World");

//  ----- Variables -----

//        PRIMITIVE TYPES

//      type name = value;
//        int age = 20;
// since we only need on byte we can change the type
        byte age = 20;
        System.out.println(age);

        age = 25;
        System.out.println(age);

        byte herAge = age;
        System.out.println(herAge);

// we can use _ to seperate every 3 digits like ,
        int viewCount = 123_456_888;
        System.out.println(viewCount);

// to define a long we need to suffix the the value with 'L'
        long mostViewed = 5_123_456_234L;
        System.out.println(mostViewed);

// suffix floats with F
        float price = 10.99F;
        System.out.println(price);

        char letter = 'K';
        System.out.println(letter);

//        boolean isElegible = False;

//        REFERENCE TYPES

// when entering 'Date' intellij automatically imports the class from the package
        Date now = new Date();
        System.out.println(now);

// with references our variable holds the address of the point object not the value
//   so if either pt1 or pt2 are changed they both will
        Point pt1 = new Point(1, 1);
        Point pt2 = pt1;
        pt2.x = 3;
        System.out.println(pt1);

//  ----- Strings -----
//                              concatenate
        String message = "Hello " + "World!";
        System.out.println(message);

        System.out.println(message.endsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("W"));
        System.out.println(message.replace("o", "0"));
        System.out.println(message.toLowerCase());

    }
}
