package level1.exercise1.model;

public class PercusionInstrument extends Instrument {
    static {
        System.out.println("Loading Percusion Instrument");
    }

    public PercusionInstrument(String name, Double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Playing Percusion instrument" + ", this its a " + this.getName() + ", a have a cost of " + this.getPrice() + " Dollars");
    }

    @Override
    public String toString() {
        return "PercusionInstrument{}";
    }
}
