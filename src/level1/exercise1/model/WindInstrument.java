package level1.exercise1.model;

public class WindInstrument extends Instrument {
    static {
        System.out.println("Loading Wind Instrument");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Playing Wind Instrument" + ", this its a " + this.getName() + ", a have a cost of " + this.getPrice() + " Dollars");
    }

}
