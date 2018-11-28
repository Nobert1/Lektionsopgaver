import java.util.Random;

public class Spil {
    private SpilleKort[] kort;
    private final int maxValue = 52;




    public Spil() {
        kort= new SpilleKort[52];
        inispil();
    }

    private void inispil(){

        for (int i = 0; i < 13; i++) {
            kort[i] = new SpilleKort('K', i);
            kort[i+13] = new SpilleKort('H',i);
            kort[i+26] = new SpilleKort('S', i);
            kort[i+39] = new SpilleKort('R', i);
        }
        // hjælpemetode der initialiserer kort
    }

    public String traekkort(){
        SpilleKort[] korttemp = this.kort;
        String firstCard = String.valueOf(this.kort[0]);
        SpilleKort firstCardKort = this.kort[0];
        for (int i = 0; i < kort.length; i++) {
            this.kort [i] = korttemp[(i+1)%52];
        }
        kort[51] = firstCardKort;
        return firstCard;
    }


    public void blandkort(){
        SpilleKort[] korttemp = new SpilleKort[52];
        //


            Random random = new Random();
            int shifts = 0;
            int pos;
        while (shifts<52) {
            pos = random.nextInt(maxValue);

            if (korttemp[pos] == null) {
                korttemp[pos] = this.kort[shifts];
                shifts ++;
            }
        }
        this.kort = korttemp;
    }


    public String toString(){
        String output = "";
        for (int i = 0; i < kort.length; i++) {
            output += kort[i] + "\n";
        }
return output;

    }

}
