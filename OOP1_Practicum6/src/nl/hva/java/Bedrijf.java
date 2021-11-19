package nl.hva.java;

import java.util.ArrayList;

public class Bedrijf {
    private String naam;
    private ArrayList<Persoon> medewerkers;
    private  int aantalMangers;

    public Bedrijf(String naam) {
        this.naam = naam;
    }

    public void printInkomsten() {

    }

    public int aantalManagers() {
        for (int i = 0; i < this.medewerkers.size(); i++) {
            if(this.medewerkers.get(i) instanceof Manager){
                this.aantalMangers ++;
            }
        }
        return this.aantalMangers;
    }

    public void neemInDienst() {

    }

    public String toString() {
        return this.naam;
    }
}
