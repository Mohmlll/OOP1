package nl.hva.java;

/**
 * @author Mohammed Malloul
 */

public class Werknemer extends Persoon {

    private static int laatstePersoneelsnummer;
    private double maandSalaris;
    private int personeelsnummer;
    private final int BEGIN_PERSONAALNR = 1000;

    /**
     * constructor
     * @param naam - naam werknemer
     * @param maandSalaris - maandsalaris werknemer
     */
    public Werknemer(String naam, double maandSalaris) {
        super(naam);
        this.maandSalaris = maandSalaris;
        if (laatstePersoneelsnummer < this.BEGIN_PERSONAALNR) {
            laatstePersoneelsnummer = this.BEGIN_PERSONAALNR;
        } else {
            laatstePersoneelsnummer ++;
        }
        this.personeelsnummer = laatstePersoneelsnummer;
    }

    /**
     * berekent inkomsten van werknemer
     * @return inkomsten van werknemer
     */
    public double berekeninkomsten() {
        return maandSalaris;
    }
}
