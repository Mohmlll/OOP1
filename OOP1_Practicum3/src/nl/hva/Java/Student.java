package nl.hva.Java;

/**
 * @author Mohammed Malloul
 * Class Student bevat gegevens van een student inclusief verwijzing class Adres
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Student {
    private int studentnr;
    private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;
    private Adres adres;

    /**
     * Constructor class Student
     * @param studentnr studentnr van student type int
     * @param voornaam  voornaam van student type String
     * @param achternaam achternaam van student type String
     * @param geboortedatum geboortedatum van student type LocalDate
     * @param adres adres van student type Adres
     */
    public Student(int studentnr, String voornaam, String achternaam, LocalDate geboortedatum, Adres adres) {
        this.studentnr = studentnr;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
    }

    /**
     *
     * @return formaat van datum dat we willen hebben.
     */
    private String korteGeboortedatum() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return this.geboortedatum.format(formatter);
    }

    /**
     *print de gegevens uit van student.
     * @return
     */
    public String toString() {
        return this.studentnr + " " + this.voornaam + " " + this.achternaam + " " + "(" + korteGeboortedatum() + ")\n" + this.adres.toString();
    }

}

