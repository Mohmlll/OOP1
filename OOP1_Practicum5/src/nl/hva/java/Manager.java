package nl.hva.java;

/**
 * @author Mohammed Malloul
 */

public class Manager extends Werknemer {
    private double bonus;


    public Manager(String naam, double maandSalaris) {
        super(naam, maandSalaris);
    }

    public void kenBonusToe(double bonus) {
        this.bonus = bonus;
    }

    public double berekeninkomsten() {
    return super.berekeninkomsten() + this.bonus;
    }
}

