package level1.exercise1.model;

public class StringInstrument extends Instrument {
    static {
        System.out.println("Loading String Instrument");
    }

    public StringInstrument(String name, Double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Playing String Instrument" + ", this its a " + this.getName() + ", a have a cost of " + this.getPrice() + " Dollars");
    }

}
