package nl.hva.Java;

public class Klas {

    private String naam;
    private int aantalStudenten;
    final int MAX_AANTAL_STUDENTEN = 30;

    private Student[] studenten = new Student[MAX_AANTAL_STUDENTEN];


    public Klas(String naam) {
        this.naam = naam;
    }

    public boolean voegStudentToe(Student student) {

        if (aantalStudenten != MAX_AANTAL_STUDENTEN) {
            this.studenten[aantalStudenten] = student;
            aantalStudenten++;
            return true;
        } else {
            return false;
        }

    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public String toString() {

        System.out.println("Klas " + this.naam + " (" + this.aantalStudenten + " studenten)");
        StringBuilder studentInfo = new StringBuilder();
        for (int i = 0; i < this.aantalStudenten; i++) {
            studentInfo.append(studenten[i])
                    .append("\n");
        }
        return studentInfo.toString();
    }

}
