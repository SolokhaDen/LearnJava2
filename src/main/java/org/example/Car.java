package org.example;

public class Car {
    private int currentSpeed;

    public Car(){
        System.out.println("Создали car");
        currentSpeed = (int) (Math.random() * 180);
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }



}
