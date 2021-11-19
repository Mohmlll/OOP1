package nl.hva.java;

public class Hulk extends Superheld {
    private int leeftijd;
    private int agressieGraad;

    /**
     * Constructor
     * @param leeftijd
     * @param agressieGraad - hoe boos is de hulk
     */
    public Hulk(int leeftijd, int agressieGraad) {
        super(leeftijd);
        this.agressieGraad = agressieGraad;
    }

    @Override
    public void trekPakAan() {
        System.out.println("Kleren uitscheuren");
    }

    @Override
    public void gebruikSuperKracht() {
        System.out.println("Groen en sterk worden");

    }

    /**
     * Hulk keert terug naar oorspronkelijke mens vorm
     */
    public boolean kalmeer() {
        agressieGraad = 0;
        System.out.println("krimpen en rustig worden " + agressieGraad);

        return true;
    }
}
