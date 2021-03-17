package com.firstjava;
//interface = outline for a class
//keeps track of what is needed but every method in the interface is needed

interface WaterBottle{
    String color = "Blue";

    void fillUp();
}

public class InterfacesExample implements WaterBottle {

    public static void main(String[] args){
        System.out.println(color);

        InterfacesExample ex = new InterfacesExample();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled!");
    }
}
