package models;

/**
 * @author Mohammed Malloul
 * date: 20-01-2020
 */

public class Vuurpijl extends Vuurwerk {
    private final int MAX_VERHOUDING = 100;
    private final int MIN_LEEFTIJD_VUURPIJL = 16;
    private final double hoogte;
    private final int[] kleurverhouding;


    public Vuurpijl(String naam, double prijs, double hoogte, int[] kleurverhouding, Instructie instructie) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
    }

    @Override
    public boolean isLegaal() {
        return super.isLegaal() && super.getInstructie().getMinimumLeeftijd() >= MIN_LEEFTIJD_VUURPIJL;
    }

    private boolean correcteKleurverhouding(int[] kleurverhouding) {
        int totaal = 0;
        for (int i = 0; i < kleurverhouding.length; i++) {
            totaal = totaal + kleurverhouding[i];
        }
        return totaal >= MAX_VERHOUDING;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t").append("Hoogte: ").append(this.hoogte).append(" meter");
        sb.append("\n\t").append("Kleuren: ").append("\n\t\t");
        if (correcteKleurverhouding(kleurverhouding)) {
            sb.append("ROOD: ").append(kleurverhouding[0]).append("%").append("\n\t\t");
            sb.append("GROEN: ").append(kleurverhouding[1]).append("%").append("\n\t\t");
            sb.append("BLAUW: ").append(kleurverhouding[2]).append("%");
        } else {
            sb.append("ROOD: ").append(100).append("%").append("\n\t\t");
            sb.append("GROEN: ").append(0).append("%").append("\n\t\t");
            sb.append("BLAUW: ").append(0).append("%").append("\n");
            sb.append("---> FOUT: Onjuiste kleurenverhouding, kleur word rood");
        }

        return super.toString() + sb.toString();
    }
}

