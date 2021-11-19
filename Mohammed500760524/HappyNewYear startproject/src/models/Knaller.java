package models;

/**
 * @author Mohammed Malloul
 * date: 20-01-2020
 */


public class Knaller extends Vuurwerk {
    private final int MAX_DECIBEL = 120;
    private final int aantalKnallen;
    private final int decibel;

    public Knaller(String naam, double prijs, int aantalKnallen, int decibel, Instructie instructie) {
        super(naam, prijs, instructie);
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }

    public int getDecibel() {
        return decibel;
    }


    @Override
    public boolean isLegaal() {

        return super.isLegaal() && this.decibel <= MAX_DECIBEL;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tAantal knallen: " + this.aantalKnallen + "\n" + "\tDecibel: " + this.decibel;
    }
}
