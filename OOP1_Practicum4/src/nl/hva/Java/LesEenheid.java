package nl.hva.Java;

/**
 * @author Mohammed Malloul
 */

public class LesEenheid {

    private final String naam;
    private final int ects;
    private final int studiejaar;

    public static final double DEFAULT_INT = -1;
    public static final boolean DEFAULT_GEHAALD = false;
    public final double ONDERGRENS_VOLDOEDE = 5.5;
    public final double BOVENGRENS_VOLDOEDE = 10.0;

    /**
     * @param naam       naam van leseenheid type String
     * @param ects       studiepunten van leseenheid type int
     * @param studiejaar studiejaar van leseenheid type int
     */
    LesEenheid(String naam, int ects, int studiejaar) {
        this.naam = naam;
        this.ects = ects;
        this.studiejaar = studiejaar;
    }

    @Override
    public String toString() {
        return this.naam + ", " + this.ects + " ects, studiejaar " + this.studiejaar;
    }


}
