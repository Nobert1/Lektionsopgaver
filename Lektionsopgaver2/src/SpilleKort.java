public class SpilleKort {
    private char farve; // S,H,R,K
    private int vaerdi; // 0 til 12


    public SpilleKort(char farve, int vaerdi) {

        this.farve = farve;
        this.vaerdi = vaerdi;


    }


    public String toString() {
        String retur = "";
        if (this.farve == 'S') {
        retur += "Spar";
        } if (this.farve == 'K') {
            retur += "Klør";

        }
          if (this.farve == 'R') {
              retur += "Ruder";
          }

        if (this.farve == 'H') {
            retur += "Hjerter";
        }



        if (this.vaerdi == 0) {
            retur += " Es";
        }

        if (this.vaerdi == 10) {
            retur += " Knægt";
        }

        if (this.vaerdi == 11) {
            retur += " Dame";
        }

        if (this.vaerdi == 12) {
            retur += " Konge";
        } if (this.vaerdi > 0 && this.vaerdi < 10) {
            retur += " " + (this.vaerdi + 1);
        }
        return retur + " " ;
    }
}


