package nl.hva.Java;
/**
 * @author Mohammed Malloul
 * Practicum 3 Studenten
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAX_STUDENTEN = 30;
        Student[] studenten = new Student[MAX_STUDENTEN];
        // hier staan alle attributen voor de input van een student
        int studentnummer;
        String voornaam;
        String achternaam;
        String geboortedatum;
        String straat;
        int huisnummer;
        String postcode;
        String woonplaats;
        String antwoord;

        char karakter;

        // naam klas wordt opgevraagd
        System.out.print("naam van klas? ");
        String klasNaam = input.nextLine();
        Klas klas = new Klas(klasNaam);

        //deze student was onderdeel van het begin van het practicum. Heb een object student aangemaakt met een object adres in een object klas hierboven.
        Adres adres = new Adres("straatnaam", 22, "2046BC", "Haarlem");
        studenten[0] = new Student(50005, "Mohammed", "Malloul", LocalDate.of(1997, 3, 24), adres);
        klas.voegStudentToe(studenten[0]);//voegt een student toe aan de klas.
        // for loop om alle input van de studenten op te vragen.
        for (int i = 1; i < MAX_STUDENTEN; i++) {

            System.out.print("studentnummer  van student: ");
            studentnummer = input.nextInt();
            input.nextLine();

            System.out.print("voornaam van student: ");
            voornaam = input.nextLine();

            System.out.print("achternaam van student: ");
            achternaam = input.nextLine();
            // do while loop om te checken of er een correcte geboortedatum is gevoerd.
            do {
                System.out.print("geboortedatum van student(dd-MM-yyyy): ");
                geboortedatum = input.nextLine();
                if (!checkGeboortedatum(geboortedatum)) {
                    System.out.println("onjuiste invoer geboortedatum");
                }
            } while (!checkGeboortedatum(geboortedatum));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate localdate = LocalDate.parse(geboortedatum, formatter);

            System.out.print("straat van student: ");
            straat = input.nextLine();

            System.out.print("huisnummer van student: ");
            huisnummer = input.nextInt();
            // do while loop om te checken of er een correcte postcode is gevoerd.
            do {
                System.out.print("postcode van student: ");
                postcode = input.nextLine();

                if (!adres.checkPostcode(postcode)) {
                    System.out.println("onjuiste invoer postcode");

                }
            } while (!adres.checkPostcode(postcode));

            System.out.print("woonplaats van student: ");
            woonplaats = input.nextLine();

            Adres adress = new Adres(straat, huisnummer, postcode, woonplaats);
            studenten[i] = new Student(studentnummer, voornaam, achternaam, localdate, adress);
            klas.voegStudentToe(studenten[i]);
            // do while loop om te checken of er een correcte invoer is gevoerd.
            do {

                System.out.print("wil je nog een student toevoegen? (y/n): ");
                antwoord = input.next();
                karakter = antwoord.charAt(0);
                if (!isGeldigeOperator(karakter)) {
                    System.out.println("ongeldige invoer.");
                    // de loop herhaalt zich als er geen juiste invoer is gestopt
                }
            } while ( !isGeldigeOperator(karakter) );
            // de loop stopt bij een invoer van n
            if (antwoord.equals("n") || antwoord.equals("N")){
                break;
            }
        }


        System.out.print(klas.toString());


    }
    // geboorte datum word gechecked of het een geldig geboortedum is.
    static boolean checkGeboortedatum(String geboortedatum) {
        return geboortedatum.matches("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$");
    }


    // karakter word gechecked of het een geledige operator is
    static boolean isGeldigeOperator(char karakter) {

        //De geldige operatoren zijn n, N, Y en y


        return karakter == 'n' || karakter == 'N' || karakter == 'y' || karakter == 'Y';
    }
}
