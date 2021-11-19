package nl.hva.java;

/**
 * @author Mohammed Malloul
 */

public class Vrijwilliger extends Persoon implements Oproepbaar {
    private final double geenInkomsten = 0;

    /**
     * constructor
     * @param naam - naam van vrijwilliger
     */
    public Vrijwilliger(String naam) {
        super(naam);
    }

    /**
     * berekent inkomsten vrijwilliger
     * @return inkomsten vrijwilliger
     */
    public double berekeninkomsten() {
        return this.geenInkomsten;
    }

    public void huurIn(int uren) {

    }
}
