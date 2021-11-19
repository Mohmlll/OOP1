package nl.hva.java;

/**
 * @author Mohammed Malloul
 */

import java.util.ArrayList;


public class Bedrijf {
    private String naam;
    private ArrayList<Persoon> medewerkers = new ArrayList<>();
    private int aantalMangers;

    /**
     * @param naam - naam van persoon
     */
    public Bedrijf(String naam) {
        this.naam = naam;
    }


    /**
     * print de inkomsten van medewerkers
     */
    public void printInkomsten() {
        StringBuilder sb = new StringBuilder("Inkomsten van alle personen:" + "\n");
        for (int i = 0; i < medewerkers.size(); i++) {
            sb.append("\t");
            if (medewerkers.get(i) instanceof Vrijwilliger) {
                sb.append(medewerkers.get(i));
                sb.append(", bedankt voor uw inzet");


            } else {
                sb.append(medewerkers.get(i));
                sb.append(", inkomsten: ");
                sb.append(medewerkers.get(i).berekeninkomsten());

            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    /**
     * telt het aantal managers op
     * @return aantal managers
     */
    public int aantalManagers() {
        for (int i = 0; i < medewerkers.size(); i++) {
            if (medewerkers.get(i) instanceof Manager) {
                this.aantalMangers++;
            }
        }
        return this.aantalMangers;
    }

    /**
     * Voegt een medewerker toe aan bedrijf
     * @param persoon - Medewerker
     */
    public void neemInDienst(Persoon persoon) {
        this.medewerkers.add(persoon);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bedrijf " + this.naam + " Heeft " + medewerkers.size() + " medewerkers: \n");
        for (int i = 0; i < medewerkers.size(); i++) {
            sb.append("\t").append(medewerkers.get(i)).append("\n");
        }

        return sb.toString();

    }
}
