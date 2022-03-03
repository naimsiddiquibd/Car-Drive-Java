package com.company;
import java.util.Scanner;
public class Car {
    Scanner sc = new Scanner(System.in);
    private String CarType;
    private int SeatLimit;
    private String Model;
    private int topSpeed;
    private String brand;
    private String manufacturingCountry;
    private int registrationNum;

    public void setInformation(){
        System.out.println("Car type : ");
        CarType = sc.nextLine();
        System.out.println("Seat limit : ");
        SeatLimit = sc.nextInt();
        sc.nextLine();
        System.out.println("Car Model : ");
        Model = sc.nextLine();
        System.out.println("Top speed of the car : ");
        topSpeed = sc.nextInt();
        sc.nextLine();
        System.out.println("Brand of the Car : ");
        brand = sc.nextLine();
        System.out.println("Manufacturing Country : ");
        manufacturingCountry = sc.nextLine();
        System.out.println("Registration Number : ");
        registrationNum = sc.nextInt();
    }
    public void display(){
        System.out.println("Type of the Car: "+CarType);
        System.out.println("Seat limit of the Car: "+SeatLimit);
        System.out.println("Model of the Car: "+Model);
        System.out.println("Top speed of the Car: "+topSpeed);
        System.out.println("Brand name of the Car: "+brand);
        System.out.println("Manufacturing country of the Car: "+manufacturingCountry);
        System.out.println("Registration Number of the Car: "+registrationNum);
    }
    public double convertSpeed(){
        double kiloMiter,convertedSpeed;
        System.out.println("Enter Speed in Kilo Miter: ");
        kiloMiter=  sc.nextDouble();
        convertedSpeed = kiloMiter * 1.6014;
        return convertedSpeed;
    }
    public void speedLimit(double convertSpeed){
        if(convertSpeed>80){
            System.out.println("You will face a fine of 5000BDT. For over speed.");
        }
        else {
            System.out.println("You are good to go.");
        }

    }
}