package nl.hva.stembureau;

import java.util.ArrayList;

/**
 * @author Mohammed Malloul
 * Studentnummer: 500760524
 * stem applicatie (TENTAMEN OOP1)
 */
public class Stemburaeu {
    private final String plaats;
    private final String straat;
    private ArrayList<Stem> stemmen = new ArrayList<>();

    /**
     * @param plaats  - naam van plaats
     * @param straat  - naam van straat
     * @param stemmen - stem van burger
     */
    public Stemburaeu(String plaats, String straat, ArrayList<Stem> stemmen) {
        this.plaats = plaats;
        this.straat = straat;
        this.stemmen = stemmen;
    }

    /**
     * voegt een stem toe aan het stembureau
     *
     * @param stem stem van staatsburger
     */
    public void voegStemToe(Stem stem) {
        this.stemmen.add(stem);
    }

    /**
     * deze methode verstuurd een stem
     */
    public void Stemmenversturen() {
        for (int i = 0; i < this.stemmen.size(); i++) {
            if (this.stemmen.get(i) instanceof DigitaleStem) {
                ((DigitaleStem) this.stemmen.get(i)).uploaden();
            }
            System.out.println();

            if (this.stemmen.get(i) instanceof PapierenStem) {
                ((PapierenStem) this.stemmen.get(i)).posten();
            }
        }
    }

    /**
     * @return lijst van stemmen
     */
    public ArrayList<Stem> getStemmen() {
        return stemmen;
    }

    /**
     * @return naam van plaats
     */
    public String getPlaats() {
        return this.plaats;
    }

    /**
     * @return naam van straat
     */
    public String getStraat() {
        return this.straat;
    }
}
