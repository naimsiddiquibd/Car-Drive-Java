package com.company;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.setInformation();
        c.display();
        double speed= c.convertSpeed();
        c.speedLimit(speed);


    }
}