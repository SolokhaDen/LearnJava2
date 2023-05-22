package org.example;

public class Truck extends Car {
    public Truck() {
        System.out.println("Создали truck");
    }

    public void printSpeed()
    {
        System.out.println("Скорость грузовика: " + getCurrentSpeed());
    }
}
