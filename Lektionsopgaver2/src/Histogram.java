import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Histogram {
    public static void main(String [] args) {


        String[] histogram = new String[10];

        Arrays.fill(histogram, "");
        Scanner scan = new Scanner(System.in);


        String b = scan.nextLine();
        Scanner sc = new Scanner(b);
        String[] parts = b.split(" ");

        int[] ary = new int[parts.length];


       // String[] parts = b.split(" ");            Hvis det skal bruges igen

        int d = 0;

        while(sc.hasNextInt()) {
            ary[d++] = sc.nextInt();
        }


        for (int i = 0; i < ary.length; i++ ) {

            int a = ary[i];

            if (a >= 1 && a < 11) {
                histogram[0] = histogram[0].concat(Character.toString('*'));
            } else if (a > 10 && a < 21) {
                histogram[1] += Character.toString('*');
            } else if (a > 20 && a < 31) {
                histogram[2] += Character.toString('*');
            } else if (a > 30 && a < 41) {
                histogram[3] += Character.toString('*');
            } else if (a > 40 && a < 51) {
                histogram[4] += Character.toString('*');
            } else if (a > 50 && a < 61) {
                histogram[5] += Character.toString('*');
            } else if (a > 60 && a < 71) {
                histogram[6] += Character.toString('*');
            } else if (a > 70 && a < 81) {
                histogram[7] += Character.toString('*');
            } else if (a > 80 && a < 91) {
                histogram[8] += Character.toString('*');
            } else if (a > 90 && a < 101) {
                histogram[9] += Character.toString('*');
            } else System.out.println();
        }
        System.out.println(" 1  - 10   |" + histogram[0] + "\n" +
        " 11 - 20  |" + histogram[1] + "\n" +
        " 21 - 30  |" + histogram [2] + "\n" +
        " 31 - 40  |" + histogram [3] + "\n" +
         " 41 - 50  |" + histogram [4] + "\n" +
        " 51 - 60  |" + histogram [5] + "\n" +
        " 61 - 70  |" + histogram [6] + "\n" +
        " 71 - 80  |" + histogram [7] + "\n" +
        "81 - 90  |" + histogram [8] + "\n" +
        "91 - 100 |" + histogram [9]);


    }
}
