package nl.hva.stembureau;

/**
 * @author Mohammed Malloul
 * Studentnummer: 500760524
 * stem applicatie (TENTAMEN OOP1)
 */

public class DigitaleStem extends Stem implements DigitaalStemmen {
    private final String bestandsformaat;


    public DigitaleStem(String stemcode, int partijkeuze, Staatsburger staatsburger, String bestandsformaat) {
        super(stemcode, partijkeuze, staatsburger);
        this.bestandsformaat = bestandsformaat;
    }

    @Override
    public void uploaden() {
        System.out.printf("Sten met code: %s wordt geupload in bestandsformaat%s", this.stemcode, this.bestandsformaat);
    }

}
