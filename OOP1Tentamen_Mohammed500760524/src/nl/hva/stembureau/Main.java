package nl.hva.stembureau;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Mohammed Malloul
 * Studentnummer: 500760524
 * stem applicatie (TENTAMEN OOP1)
 */

public class Main {

    public static void main(String[] args) {
        int aantalGegenereerd = 10;

        System.out.println("Welkom bij het tentamen Stembureau: Mohammed, IS106B, 500760524");

        Staatsburger test = new Staatsburger("Teststaatsburger", LocalDate.of(2019, 10, 30));
        Stem stem = new Stem("TEST01", 1, test);

        System.out.println("\n--------- Stap 1: Stem en Staatsburger ---------");
        System.out.println(stem.toString());

        ArrayList<Stem> stemmen = new ArrayList<>();

        Stemburaeu stemburaeu = new Stemburaeu("Alaska", "Nikolai", stemmen);
        System.out.println("\n--------- Stap 2: Stembureau ---------\n");
        System.out.printf("Welkom bij het stembureau in: %s, %s", stemburaeu.getStraat(), stemburaeu.getPlaats());

        System.out.println("\n--------- Stap 3: DigitaleStem en PapierenStem ---------\n");

        DigitaleStem digitaleStem = new DigitaleStem(stem.getStemcode(), stem.getPartijkeuze(), test, ".pdf");
        PapierenStem papierenStem = new PapierenStem(stem.getStemcode(), stem.getPartijkeuze(), test, "a4");
        digitaleStem.uploaden();
        System.out.println();
        papierenStem.posten();

        System.out.println("\n--------- Stap 4: DigitaleStem en PapierenStem versturen via het Stembureau ---------\n");

        for (int i = 0; i < aantalGegenereerd; i++) {
            stemburaeu.voegStemToe(genereerDigitaleStem());
            stemburaeu.voegStemToe(genereerPapierenStem());
        }

        Collections.sort(stemmen);

        stemburaeu.Stemmenversturen();

    }

    private static DigitaleStem genereerDigitaleStem() {
        Staatsburger staatsburger = new Staatsburger("Teststaatsburger",
                LocalDate.of(1993, 11, 16), "Nikolai");
        return new DigitaleStem("DIGTAAL_TEST" + (int) (Math.random() * 901 +
                100), 1, staatsburger, ".pdf");
    }

    private static PapierenStem genereerPapierenStem() {
        Staatsburger staatsburger = new Staatsburger("Teststaatsburger",
                LocalDate.of(1988, 10, 13), "Nikolai");
        return new PapierenStem("PAPIER_TEST" + (int) (Math.random() * 901 +
                100), 0, staatsburger, "A4");
    }
}
