package nl.hva.java;

public class Werknemer extends Persoon {

    private int laatstePersoneelsnummer;
    private double maandSalaris;
    private int personeelsnummer;
    private int minPersoneelnr;

    public Werknemer(String naam, double maandSalaris) {
        super(naam);
        this.maandSalaris = maandSalaris;

    }

    public int genereerPnr(){
        personeelsnummer = laatstePersoneelsnummer;
       if (this.laatstePersoneelsnummer< this.minPersoneelnr){
           this.laatstePersoneelsnummer = minPersoneelnr;
           personeelsnummer = laatstePersoneelsnummer;
           personeelsnummer ++;
       }else{
           personeelsnummer++;
       }
       return personeelsnummer;
    }

    public double berekeninkomsten() {
        this.maandSalaris = this.maandSalaris;
        return maandSalaris;
    }
}
