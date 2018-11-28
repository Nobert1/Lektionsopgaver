import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class Middel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers = scan.nextLine();
        System.out.println(numbers);
        //int[] arr = new int[50];

        int[] arr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();


        //String[] parts = b.split(" ");
/*
        int i = 0;

        Scanner sc = new Scanner(numbers);

        while(sc.hasNextInt()){
            arr[i++] = sc.nextInt();
        }
*/
        int a = 0;
        int counter;
        for (counter = 0; counter < arr.length; counter++) {
            a += arr[counter];
        }
        double a2 = new Double(a);
        double c2 = new Double(counter);
        double mean = a2 / (c2);

double variansen = 0;

        for (int w = 0; w < arr.length; w++) {
            double f = (1.0 / arr.length);
            double o = (f*(Math.pow((arr[w] - mean),2.0)));
            variansen += o;
        }

        double deviation = Math.sqrt(variansen);
        System.out.println("Standard deviation " + deviation);
        System.out.println("mean " + mean);
        System.out.println("værdi " + Arrays.toString(arr));

    }
}
