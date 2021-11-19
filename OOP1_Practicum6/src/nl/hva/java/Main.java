package nl.hva.java;

public class Main {

    public static void main(String[] args) {

        Bedrijf bedrijf = new Bedrijf("HvA");

        Werknemer w = new Werknemer("Jantine Jansen", 1200);
        bedrijf.neemInDienst(w);

        w = new Werknemer("Piet Pietersen", 1300);
        bedrijf.neemInDienst(w);

        Vrijwilliger v = new Vrijwilliger("Guus Goedhart");
        bedrijf.neemInDienst(v);
        v.huurIn(10);

        Manager m = new Manager("Brigitte Baas", 10000);
        bedrijf.neemInDienst(m);
        m.kenBonusToe(750);

        m = new Manager("Dirk Teur", 10000);
        bedrijf.neemInDienst(m);
        m.kenBonusToe(1200);

        Zzper z = new Zzper("Beun Haas", 120);
        bedrijf.neemInDienst(z);
        z.huurIn(40);

        System.out.println(bedrijf);
        bedrijf.printInkomsten();
        System.out.println("\nAantal in management: " + bedrijf.aantalManagers());
    }
}
}
