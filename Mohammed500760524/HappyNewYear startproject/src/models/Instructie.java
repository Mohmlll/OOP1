package models;

public class Instructie {

    private final boolean nederlandstalig;
    private final int minimumLeeftijd;
    private final String omschrijving;

    /**
     * @param nederlandstalig - of het wel of niet nederlands vuurwerk is
     * @param minimumLeeftijd - minimum leeftijd om het vuurwerk aan te steken
     * @param omschrijving    - omschrijving van het vuurwerk
     */
    public Instructie(boolean nederlandstalig, int minimumLeeftijd, String omschrijving) {
        this.nederlandstalig = nederlandstalig;
        this.minimumLeeftijd = minimumLeeftijd;
        this.omschrijving = omschrijving;
    }

    /**
     * @return of het vuurwerk nederlands is
     */
    boolean isNederlandstalig() {
        return this.nederlandstalig;
    }

    /**
     * @return minimum leeftijd aangegeven op vuurwerk
     */
    public int getMinimumLeeftijd() {
        return minimumLeeftijd;
    }

    @Override
    public String toString() {
        return "Nederlandstalig=" + this.nederlandstalig + ", leeftijd=" + this.minimumLeeftijd + ", omschrijving=" + this.omschrijving;
    }
}


