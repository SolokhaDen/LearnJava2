package org.example;

public class Legkovuha extends Car {
    public Legkovuha() {
        System.out.println("Создали legkovuhu");
    }

    public void printSpeed(){
        System.out.println("Скорость легковухи: "+ getCurrentSpeed());
    }
}
