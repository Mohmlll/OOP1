package models;

/**
 * @author Mohammed Malloul
 * date: 20-01-2020
 */


public class Vuurwerk extends Product {
    private Instructie instructie;


    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        super(naam, prijs);
        this.instructie = instructie;
    }

    public Vuurwerk(String naam, double prijs) {
        super(naam, prijs);
    }

    public Instructie getInstructie() {
        return instructie;
    }

    @Override
    public boolean isLegaal() {
        return this.instructie != null && getInstructie().isNederlandstalig();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Naam: ").append(this.naam).append("\n");
        sb.append("\t").append("Prijs: ").append(EURO).append(this.prijs).append("\n");
        if (this.instructie != null) {
            sb.append("\t").append("Instructie: ").append(this.instructie).append("\n");
        } else {
            sb.append("\t").append("Instructie: ").append("Ontbreekt").append("\n");
        }

        sb.append("\t").append("Legaal: ").append(this.isLegaal());

        return sb.toString();
    }
}
