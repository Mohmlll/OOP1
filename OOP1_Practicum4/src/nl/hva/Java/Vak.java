package nl.hva.Java;

/**
 * @author Mohammed Malloul
 */

public class Vak extends LesEenheid {
    private double cijfer;

    /**
     * constructor
     * @param cijfer - cijfer van Vak
     * @param naam - naam van Vak
     * @param ects - studiepunten van Vak
     * @param studiejaar - studiejaar van Vak
     */
    Vak(double cijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.cijfer = cijfer;
    }

    Vak(String naam, int ects, int studiejaar) {
        this(DEFAULT_INT, naam, ects, studiejaar);
    }


    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    @Override
    public String toString() {
        return super.toString() + ", cijfer " + this.cijfer;
    }

    public boolean isAfgerond() {

        return this.cijfer >= ONDERGRENS_VOLDOEDE && this.cijfer <= BOVENGRENS_VOLDOEDE;

    }
}