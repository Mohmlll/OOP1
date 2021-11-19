package nl.hva.Java;

/**
 * @author Mohammed Malloul
 * Bsa monitor 3.0 deel 2
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aantalVakken = 7;
        double cijfer;
        int totaalPunten = 0;

        Vak[] vakken = new Vak[aantalVakken];

        vakken[0] = new Vak("Fasten your Seatbelt", 12);
        vakken[1] = new Vak("Programming", 3);
        vakken[2] = new Vak("User interaction", 3);
        vakken[3] = new Vak("Personal Skilss", 2);
        vakken[4] = new Vak("Databases", 3);
        vakken[5] = new Vak("OOP1", 3);
        vakken[6] = new Vak("Project Skills", 2);

        System.out.println("Voer behaalde cijfer in: ");
        for (int i = 0; i < vakken.length; i++) {

            System.out.print(vakken[i].getNaam() + ": ");
            cijfer = input.nextDouble();
            vakken[i].setCijfer(cijfer);
        }


        for (int i = 0; i < vakken.length; i++) {
            System.out.printf("Vak/Project: %-25s Cijfer: %-4.1f Punten: %-4d\n", vakken[i].getNaam(), vakken[i].getCijfer(), vakken[i].gehaaldePunten());
            totaalPunten += vakken[i].getPunten();
        }
        Vak.setTotaalPunten(totaalPunten);
        System.out.println();
        Vak.bsaAdvies();

    }

}
