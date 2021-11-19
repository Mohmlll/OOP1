package nl.hva.Java;

/**
 * @author Mohammed Malloul
 */

public class ProfessionalSkills extends LesEenheid {
    private boolean gehaald;

    ProfessionalSkills(boolean gehaald, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.gehaald = gehaald;
    }

    ProfessionalSkills(String naam, int ects, int studiejaar) {
        this(DEFAULT_GEHAALD, naam, ects, studiejaar);
    }

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }

    @Override
    public String toString() {
        String gehaaldString;
        if (this.gehaald) {
            gehaaldString = "gehaald";
        } else {
            gehaaldString = "niet gehaald";
        }
        return super.toString() + ", " + gehaaldString;
    }

    public boolean isAfgerond() {
        return this.gehaald;

    }
}
