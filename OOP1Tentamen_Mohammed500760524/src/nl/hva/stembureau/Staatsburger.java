package nl.hva.stembureau;

import java.time.LocalDate;

/**
 * @author Mohammed Malloul
 * Studentnummer: 500760524
 * stem applicatie (TENTAMEN OOP1)
 */

public class Staatsburger {

    private final String naam;
    private final LocalDate paspoortVerloopDatum;
    private final String geboorteplaats;

    public Staatsburger(String naam, LocalDate paspoortVerloopDatum, String geboorteplaats) {
        this.naam = naam;
        this.paspoortVerloopDatum = paspoortVerloopDatum;
        this.geboorteplaats = geboorteplaats;
    }

    public Staatsburger(String naam, LocalDate paspoortVerloopDatum) {
        this.naam = naam;
        this.paspoortVerloopDatum = paspoortVerloopDatum;
        this.geboorteplaats = "onbekend";
    }

    public boolean isPaspoortVerlopen() {
        return paspoortVerloopDatum.isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String isVerlopen;
        if (isPaspoortVerlopen()) {
            isVerlopen = "ja";
        } else {
            isVerlopen = "nee";
        }
        sb.append("Naam: ").append(this.naam).append(", paspoort verloopt op: ").append(this.paspoortVerloopDatum)
                .append(", is paspoort verlopen: ").append(isVerlopen).append(", geboorteplaats: ").append(this.geboorteplaats);
        return sb.toString();
    }
}
