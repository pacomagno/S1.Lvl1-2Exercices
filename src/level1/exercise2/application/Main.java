package level1.exercise2.application;

import level1.exercise2.model.Car;

public class Main {
    public static void main(String[] args) {

        Car.brake();

        Car car1 = new Car(580);
        car1.accelerate();


        System.out.println("Brand " + car1.getBrand());
        System.out.println("Model " + car1.getModel());
        System.out.println("Horsepower " + car1.getHORSEPOWER());
    }
}
