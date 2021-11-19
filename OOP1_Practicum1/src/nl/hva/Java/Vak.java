package nl.hva.Java;

public class Vak {
    String naam;
    int punten;
    double cijfer;

    Vak(String nieuweNaam, int nieuwePunten) {
        naam = nieuweNaam;
        punten = nieuwePunten;

    }

    String getNaam() {
        return naam;
    }

    double getCijfer() {
        return cijfer;
    }

    void setCijfer(double niewCijfer) {

        cijfer = niewCijfer;
    }

    int gehaaldePunten() {
        if (cijfer < 5.5) {
            punten = 0;
        }
        return punten;
    }
}

