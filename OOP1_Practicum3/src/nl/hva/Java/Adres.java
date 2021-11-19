package nl.hva.Java;

public class Adres {
    String straat;
    private int huisnr;
    private String postcode;
    private String plaats;


    public Adres(String straat, int huisnr, String postcode, String plaats) {
        this.straat = straat;
        this.huisnr = huisnr;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    public String getPostcode() {
        return postcode;
    }

    public String toString() {
        return "Adres: " + this.straat + " " + this.huisnr + ", " + this.postcode + " " + this.plaats;
    }

    public boolean checkPostcode(String postcode) {

        return postcode.matches("[1-9][0-9]{3}[a-zA-Z]{2}");

    }

}
