package level1.exercise1.application;

import level1.exercise1.model.Instrument;
import level1.exercise1.model.PercusionInstrument;
import level1.exercise1.model.StringInstrument;
import level1.exercise1.model.WindInstrument;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== DEMO 1: Access static method (forces Instrument class load) ===");

        System.out.println("Total instruments (BEFORE): " + Instrument.getTotalInstruments());

        System.out.println("\n=== DEMO 2: Create instances (load subclasses) ===");
        WindInstrument saxofone = new WindInstrument("Saxofone", 560.50);
        saxofone.play();

        System.out.println();

        StringInstrument violin = new StringInstrument("Violin", 1250.50);
        violin.play();

        System.out.println();

        PercusionInstrument drums = new PercusionInstrument("Drums", 450.50);
        drums.play();

        System.out.println();

        System.out.println("\n=== DEMO 3: Verify static counter ===");
        System.out.println("Total instruments (AFTER): " + Instrument.getTotalInstruments());
    }

}
