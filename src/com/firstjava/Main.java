package com.firstjava;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

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

//   ----- Arrays ----
//                             specify size
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // prints the address
        System.out.println(Arrays.toString(numbers));

        int[] nms = {2, 12, 4, 1, 5};
        System.out.println(nms.length);

        Arrays.sort(nms);
        System.out.println(Arrays.toString(nms));

//        Multi Dimensional Array

//                                 [rows] [columns]
        int[][] dimensions = new int[2][3];
        dimensions[0][0] = 1;
        System.out.println(Arrays.deepToString(dimensions));

        int[][] dmnsions = {{2, 4, 6}, {3, 6, 9}};
        System.out.println(Arrays.deepToString(dmnsions));

//   ----- Constants -----

// when we don't want out values to change
        final float pi = 3.14F;
//        pi = 2;  => not allowed

//   ----- Arithmetic Expressions -----
        int addition = 10 + 5;

        int division = 10 / 3; // returns whole number = 3
        var result = (double) 10 / (double) 3;
        System.out.println(result);

        int increment = 1;
        increment++; // increments by 1
        System.out.println(increment);

        int y = 1;
        int z = y++;
        System.out.println(y);
        System.out.println(z);

        int x = 1;
//      x = x + 2; is the same as:
        x += 2;
//      x -= 2 | x *= 2 | x /= 2
        System.out.println(x);

//   ----- Casting -----
        double ex = 1.1;
        int why = (int) ex + 2;
        System.out.println(why);

// we always receive user input as a string so we ned to convert them into their numerical representation
        String n = "1";
        int l = Integer.parseInt(n) + 4;
        System.out.println(l);

//  ----- Math Class -----
        int rounded = Math.round(1.1F);
        System.out.println(rounded);

        int ceiling = (int) Math.ceil(1.1F);
        System.out.println(ceiling);

        int floor = (int) Math.floor(1.1F);
        System.out.println(floor);

        int max = Math.max(1, 5);
        System.out.println(max);

        int random = (int) Math.round(Math.random() * 100);
        System.out.println(random);

//   ----- Formatting Numbers -----

//      factory method
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res = currency.format(12345.91);
        System.out.println(res);

        String rest = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(rest);

//   ----- Reading Input -----
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        byte yourAge = scanner.nextByte();
//        System.out.println("You are " + yourAge);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your age: ");
////                            returns full input . trims any whitespaces
//        String yourName = scan.nextLine().trim();
//        System.out.println("You are " + yourName);

        //    ----- Comparison Operators -----

        int o = 1;
        int t = 2;
        System.out.println(x <= y);

        int temp = 12;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

        boolean highIncome = true;
        boolean goodCredit = true;
        boolean isEligible = highIncome || goodCredit;

//   ----- If Statements -----
        if (temp > 30) {
            System.out.println("It's hot out!");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful Day!");
        } else {
            System.out.println("It's cold!");
        }

        int income = 100_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

//        Ternary Operator
//                         condition       if true : if false
        String className = hasHighIncome ? "First" : "Economy";
        System.out.println(className);

//  ----- Switch Case ------
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("Your are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

//   ----- For Loops -----
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println();

        for (int i = 5; i > 0; i--){
            System.out.println(i);
        }

        System.out.println();

        int i = 0;
        while (i > 0){
            System.out.println(i);
            i--;
        }

//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//// we cannot use comparison operators with reference types
//// because it compares the address of the object not the value
//        while (!input.equals("quit")){
//            System.out.println("Input: (enter 'quit' to exit) ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input );
//        }

//        do while
//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }while (!input.equals("quit"));

//   ----- For Each Loop -----
//   used to iterate through arrays or collections

    String[] fruits = { "Apple", "Mango", "Orange"};

    for (String fruit : fruits)
        System.out.println(fruit);

    }
    }

