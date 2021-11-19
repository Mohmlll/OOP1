package nl.hva.java;

public abstract class Superheld {
    private int leeftijd;

    public Superheld(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    /**
     * Superheld die pak aantrekt
     */
    public abstract void trekPakAan();

    /**
     * Gebruik van generieke superkracht
     */
    public void gebruikSuperKracht() {
        System.out.println("standaard gebruik superkracht");
    }
}
