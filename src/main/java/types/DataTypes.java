package types;


import org.example.Car;

public class DataTypes {
    public static void main(String[] args) {
        // Примитивы и ссылочные типы

        // Примитивы:
        byte b;
        short t;
        int i; // чаще всего
        long l;

        float f = 1.2f;
        double d = 1.2;

        boolean bool = true;//false

        char c = 80; //ASCII 'a' = [0, 255];

        // Ссылочные типы (наследуются от Object)
        String s = "asd";
        Object obj;


        // Различия.
        // Передача в методы
        // Примитивы - по значению(оно копируется)
        int value = 16;
        primitive(value);
        System.out.println("Значение value после метода: " + value);


        // Ссылочные типы - по ссылке(на один и тот же объект)
        Car car = new Car();
        System.out.println("Значение car speed до метода: " + car.getCurrentSpeed());
        sylochny(car);
        System.out.println("Значение car speed после метода: " + car.getCurrentSpeed());

    }

    public static void primitive(int b) {
        b = b + 15;
        System.out.println("Значение I = " + b);
    }

    public static void sylochny(Car carObject){
        carObject.setCurrentSpeed(100500);
        System.out.println("Значение CurrentSpeed внутри метода = " + carObject.getCurrentSpeed());
    }
}
