import java.util.Arrays;

public class Badevand {
    public static void main(String[] args){
        int[] badetemp = { 12, 10, 12, 14, 15, 16, 18, 18, 15 };
        System.out.println("Maksimum: " + maks(badetemp));
        System.out.println("Antal fald: " + antalfald(badetemp));
    }
    public static int maks(int[] badetemp){
        // skriv metode der returnerer maks temperatur
        int max = Arrays.stream(badetemp).max().getAsInt();
        return max;
    }
    public static int antalfald(int[] badetemp) {
   // skriv metode der returnerer antal fald
        int fald = 0;
                for(int i = 1; i < badetemp.length; i++)

                if (badetemp[i] < badetemp[i -1]) {
                    fald++;
                }
return fald;
    }
}

