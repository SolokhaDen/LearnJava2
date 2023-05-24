package org.example;

public class Main {

    // Модификаторы доступа:
    // public - видно отовсюду
    // protected - видно в том же пакете + наследники классов из других пакетов
    // default(package-private, невидимый) - доступ только в том же пакете
    // private - видно только в том же классе

    // Ключевые слова:
    // final: классы, методы, переменные
    // extends: наследование
    // static: принадлежность классу (или объекту, если нет static)

    // Типы данных:
    // примитивы: int double boolean float byte
    // ссылочные: String и все классы.

    // todo:  ссылка и объект

    public static void main(String[] args) {

        System.out.println(new String("80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов 80 символов ")
                .substring(0,80));
        Truck truck = new Truck();
        truck.printSpeed();

        System.out.println();

        Legkovuha legkovuha = new Legkovuha();
        legkovuha.printSpeed();

        System.out.println();

        truck.printSpeed();

    }
}