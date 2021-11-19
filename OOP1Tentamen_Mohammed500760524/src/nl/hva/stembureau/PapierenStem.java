package nl.hva.stembureau;

/**
 * @author Mohammed Malloul
 * Studentnummer: 500760524
 * stem applicatie (TENTAMEN OOP1)
 */

public class PapierenStem extends Stem implements PapierStemmen {
    private final String papierformaat;

    public PapierenStem(String stemcode, int partijkeuze, Staatsburger staatsburger, String papierformaat) {
        super(stemcode, partijkeuze, staatsburger);
        this.papierformaat = papierformaat;
    }

    @Override
    public void posten() {
        System.out.printf("Sten met code: %s wordt gepost, papierformaat: %s", this.stemcode, this.papierformaat);
    }
}
