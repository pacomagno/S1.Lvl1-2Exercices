package Lvl1.Exercise2.model;

public class Car {
    private static final String brand = "Ferrari";
    private static String model = "Maranello";
    private final int horsePower;

    public Car(int horsePower) {this.horsePower = horsePower;}

    public static String getModel() {return model;}
    public static String getBrand() {return brand;}
    public int getHorsePower() {return horsePower;}

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
    public static void brake() {System.out.println("The vehicle is braking");}

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                '}';
    }
}
