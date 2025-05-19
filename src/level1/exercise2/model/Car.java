package level1.exercise2.model;

public class Car {
    private static final String brand = "Ferrari";
    private static String model = "Maranello";
    private final int HORSEPOWER;

    public Car(int HORSEPOWER) {
        this.HORSEPOWER = HORSEPOWER;
    }

    public static String getModel() {return model;}
    public static String getBrand() {return brand;}
    public int getHORSEPOWER() {return HORSEPOWER;}

    public void accelerate() {
        System.out.println("The "+ this.brand+ " " + this.model + " vehicle is accelerating");
    }
    public static void brake() {System.out.println("The vehicle is braking");}

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + HORSEPOWER +
                '}';
    }
}
