package nl.hva.java;

public abstract class Persoon {

    private String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    @Override
    public double berekeninkomsten() {

    }

    @Override
    public int compareTo(Persoon namen) {
        return namen.naam.compareTo(this.naam);
    }

    @Override
    public String toString() {
        return this.naam;
    }

}

