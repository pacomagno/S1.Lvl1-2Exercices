package Lvl1.Exercise1.model;

public class StringInstrument extends Instrument {
    static {
        System.out.println("Loading String Instrument");
    }

    public StringInstrument(String name, Double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Playing String Instrument");
    }

}
