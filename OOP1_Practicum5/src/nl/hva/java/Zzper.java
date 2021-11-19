package nl.hva.java;

/**
 * @author Mohammed Malloul
 */

public class Zzper extends Persoon implements Oproepbaar{
    private double uurtarief;
    private int urenGewerkt;
    private double kosten;

    /**
     * constructor
     * @param naam - naam zzper
     * @param uurtarief - uurtarief van zzper
     */
    public Zzper(String naam, double uurtarief) {
        super(naam);
        this.uurtarief = uurtarief;
    }

    /**
     * berekent inkomsten
     * @return inkomsten van zzper
     */
    public double berekeninkomsten() {
        this.kosten = this.urenGewerkt * this.uurtarief;
        return kosten;
    }

    @Override
    public void huurIn(int uren) {
        this.urenGewerkt = this.urenGewerkt + uren;
    }
}
