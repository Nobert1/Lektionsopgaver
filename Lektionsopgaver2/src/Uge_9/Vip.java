package Uge_9;

public class Vip extends Ansat {

    private String[] kursus;

    public Vip(String navn, String institutnavn, String[] kursus) {

        super(navn, institutnavn);
        this.kursus = kursus;
    }

    public String[] getKursus() {
        return kursus;
    }

    public void setKursus(String[] kursus) {
        this.kursus = kursus;
    }


    public String printKursus() {
        String output = "";
        for (int i = 0; i < this.kursus.length; i++) {
            output +=  "\n\t[kursus=" + this.kursus[i] +
                    "]";
        }
        return output;
    }


    @Override
    public String toString() {
        return "class Uge_9.Vip\n\t[navn="+getNavn()+"]" + "\n\t[institutnavn="+getInstitutnavn()+"]" + printKursus();
        }
}
