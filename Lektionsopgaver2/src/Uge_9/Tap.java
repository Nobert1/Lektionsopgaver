package Uge_9;

public class Tap extends Ansat {

    private int arbejdstid;
    public Tap(String navn, String Institutnavn, int arbejdstid) {

        super(navn, Institutnavn);
        this.arbejdstid = arbejdstid;

    }

    public int getArbejdstid() {
        return arbejdstid;
    }

    public void setArbejdstid(int arbejdstid) {
        this.arbejdstid = arbejdstid;
    }

    @Override
    public String toString() {
        return "class Uge_9.Tap\n\t[navn="+getNavn()+"]" +
                "\n\t[institutnavn="+getInstitutnavn()+"]" +
                "\n\t[arbejdstid="+arbejdstid+"]";
    }
}
//