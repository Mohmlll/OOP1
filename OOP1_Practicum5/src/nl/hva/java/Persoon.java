package nl.hva.java;

/**
 * @author Mohammed Malloul
 */

public abstract class Persoon implements Comparable<Persoon>{

    private String naam;

    /**
     * @param naam - naam van persson
     */
    public Persoon(String naam) {
        this.naam = naam;
    }

    /**
     * berekent inkomsten
     * @return inkomsten van medewerker
     */
    public abstract double berekeninkomsten();

    @Override
    public int compareTo(Persoon namen) {
        return namen.naam.compareTo(this.naam);
    }

    @Override
    public String toString() {
        return this.naam;
    }

}

