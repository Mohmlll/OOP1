package nl.hva.stembureau;

/**
 * @author Mohammed Malloul
 * Studentnummer: 500760524
 * stem applicatie (TENTAMEN OOP1)
 */

public class Stem implements Comparable {
    public static final int KEUZE_REPUBLIKEINS = 0;
    public static final int KEUZE_DEMOCRATISCH = 1;
    private final Staatsburger staatsburger;
    protected String stemcode;
    protected int partijkeuze;

    public Stem(String stemcode, int partijkeuze, Staatsburger staatsburger) {
        this.stemcode = stemcode;
        this.partijkeuze = partijkeuze;
        this.staatsburger = staatsburger;
    }

    public String getStemcode() {
        return stemcode;
    }

    public int getPartijkeuze() {
        return partijkeuze;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String keuze;
        if (this.partijkeuze == KEUZE_REPUBLIKEINS) {
            keuze = "Republikeins";
        } else if (this.partijkeuze == KEUZE_DEMOCRATISCH) {
            keuze = "Democratisch";
        } else {
            keuze = "neutraal";
        }
        sb.append("stemcode: ").append(this.stemcode).append(", partijkeuze: ")
                .append(keuze).append("\n\n").append("staatsburger gegevens: \n");

        return sb.toString() + staatsburger.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
