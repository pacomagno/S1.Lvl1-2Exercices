package Lvl1.Exercise1.model;

public class PercusionInstrument extends Instrument {
    static {
        System.out.println("Loading Percusion Instrument");
    }

    public PercusionInstrument(String name, Double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Playing Percusion instrument");
    }

}
