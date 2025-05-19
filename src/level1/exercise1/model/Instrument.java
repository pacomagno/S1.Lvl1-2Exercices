package level1.exercise1.model;

public abstract class Instrument {

    private String name;
    private double price;
    private static int totalInstruments = 0;

    static {
        System.out.println("⚡ Loading base Instrument class");
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
        totalInstruments++;
    }

    public static int getTotalInstruments() {
        return totalInstruments;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public abstract void play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
