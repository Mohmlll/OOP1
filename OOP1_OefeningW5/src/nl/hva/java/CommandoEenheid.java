package nl.hva.java;

public class CommandoEenheid implements Comparable<Superheld> {
    private Superheld[] helden;
    private int aantalHelden;


    public void voegHeldToe(Superheld held) {
        this.helden[aantalHelden] = held;

        this.aantalHelden++;
    }

    public void redDeWereld() {
        for (int i = 0; i < this.helden.length; i++) {
            helden[i].gebruikSuperKracht();
        }
    }

    public void kalmeerHulken() {
        for (int i = 0; i < this.helden.length; i++) {
            if (this.helden[i] instanceof Hulk){
                ((Hulk) this.helden[i]).kalmeer();
            }
        }
    }


    @Override
    public int compareTo(Superheld lol) {
        return Integer.compare(this.aantalHelden, );
    }
}
