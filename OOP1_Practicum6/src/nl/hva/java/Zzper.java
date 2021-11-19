package nl.hva.java;

public class Zzper extends Persoon implements Oproepbaar{
    private double uurtarief;
    private int urenGewerkt;
    private double kosten;

    public Zzper(String naam, double uurtarief) {
        super(naam);
        this.uurtarief = uurtarief;
    }

    public double berekeninkomsten() {
        this.kosten = this.urenGewerkt * this.uurtarief;
        return kosten;
    }

    public void huurIn(int uren) {
        this.urenGewerkt = this.urenGewerkt + uren;
    }
}
