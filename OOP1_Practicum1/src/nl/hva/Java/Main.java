package nl.hva.Java;

/**
 * @author Mohammed Malloul
 * Bsa monitor 3.0
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vak fys = new Vak("Fasten your Seatbelt", 12);

        System.out.print("Voer behaalde cijfer voor " + fys.getNaam() + " in: ");
        double cijfer = input.nextDouble();

        fys.setCijfer(cijfer);

        System.out.println("Vak/Project: " + fys.getNaam() + "\tCijfer: " + fys.getCijfer() + "\tpunten: " + fys.gehaaldePunten());
    }

}
