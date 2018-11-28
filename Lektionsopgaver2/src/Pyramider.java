
import java.util.Scanner;
public class Pyramider {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int j;
                for (j = n - i; j > 1; j--) {
                System.out.println(".");
                    for (j = 0; j <= i; j++) {
                    System.out.println("*");
                }
            }
        }
    }
}

