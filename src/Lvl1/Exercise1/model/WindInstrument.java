package Lvl1.Exercise1.model;

public class WindInstrument extends Instrument {
    static {
        System.out.println("Loading Wind Instrument");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Playing Wind Instrument");
    }

}
