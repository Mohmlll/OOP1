package nl.hva.Java;

/**
 * @author Mohammed Malloul
 * Class Vak voor main Bsamonitor3 versie 2
 */

public class Vak {


    private String naam;
    private int punten;
    private double cijfer;
    static int totaalPunten = 0;

    /**
     * Maakt een vak met naam en stundiepunten
     *
     * @param naam   naam van het vak
     * @param punten aantal punten dat er verdient kan worden
     */
    public Vak(String naam, int punten) {
        this.naam = naam;
        this.punten = punten;

    }

    /**
     * vraagt een cijfer op uit de main
     *
     * @param cijfer behaald cijfer voor een vak
     */
    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    /**
     * vraagt het totaal verdiende studiepunten op uit de main
     *
     * @param totaalPunten totale verdiende stundie punten
     */
    public static void setTotaalPunten(int totaalPunten) {
        Vak.totaalPunten = totaalPunten;
    }

    /**
     * vraagt naar studiepunten
     *
     * @return behaalde punten per vak
     */
    public int getPunten() {
        return punten;
    }

    /**
     * vraagt naar het cijfer
     *
     * @return cijfer per vak
     */
    public double getCijfer() {
        return cijfer;
    }

    /**
     * vraagt naar de naam van het vak
     *
     * @return naam per vak
     */
    public String getNaam() {
        return naam;
    }

    /**
     * vraagt naar het behaalde aantal studiepunten
     *
     * @return behaalde punten per vak
     */
    public int gehaaldePunten() {
        if (cijfer < 5.5) {
            punten = 0;
        }
        return punten;
    }

    /**
     * Deze methode print uit het totaal verdiende punten en het studie advies
     */
    public static void bsaAdvies() {
        int maxPunten = 28;
        System.out.println("Totaal behaalde studiepunten: " + totaalPunten + "/" + maxPunten);
        if (totaalPunten < 26) {

            System.out.println("PAS OP: je ligt op schema voor een negatief BSA");
        } else {
            System.out.println("Goed bezig: je ligt op schema voor een Positief BSA");
        }

    }

}

