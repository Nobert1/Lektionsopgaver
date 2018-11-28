package Uge_9;

public class Studerende extends Person {

    private String studienummer;

    public Studerende(String navn, String studienummer) {
        super(navn);
        this.studienummer = studienummer;
    }

    public String getStudienummer() {
        return studienummer;
    }

    public void setStudienummer(String studienummer) {
        this.studienummer = studienummer;
    }

    @Override
    public String toString() {
        return "class Uge_9.Studerende\n\t[navn="+getNavn()+ "]" + "\n\t[studienummer="+studienummer+"]";
    }
}
