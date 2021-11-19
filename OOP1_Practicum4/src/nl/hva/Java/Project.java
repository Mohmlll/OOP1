package nl.hva.Java;

/**
 * @author Mohammed Malloul
 */

public class Project extends LesEenheid {

    private double productCijfer;
    private double procesCijfer;
    private double methodenEnTechniekenCijfer;

    Project(double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    Project(String naam, int ects, int studiejaar) {
        this(DEFAULT_INT, DEFAULT_INT, DEFAULT_INT, naam, ects, studiejaar);
    }

    public void setProductcijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public void setProcescijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public void setMethodenEnTechniekenCijfer(double methodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.productCijfer + ")" + " (" + this.procesCijfer + ")" + " (" + this.methodenEnTechniekenCijfer + ")";
    }

    public boolean isAfgerond() {
        return this.productCijfer >= ONDERGRENS_VOLDOEDE && this.productCijfer <= BOVENGRENS_VOLDOEDE && this.procesCijfer >= ONDERGRENS_VOLDOEDE && this.procesCijfer <= BOVENGRENS_VOLDOEDE && this.methodenEnTechniekenCijfer >= ONDERGRENS_VOLDOEDE && this.methodenEnTechniekenCijfer <= BOVENGRENS_VOLDOEDE;
    }

}
