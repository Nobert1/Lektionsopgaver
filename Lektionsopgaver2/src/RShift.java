import java.util.Scanner;

public class RShift {

	public static void main(String[] args) {
		int[] ints = parseInput();
		int[] newInts = new int[ints.length-1];

		//TODO Fill in logic

		//TODO Print the result to console
		
	}

	private static int[] parseInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] strings = input.split(" ");
		int[] ints = new int[strings.length]; 
		for (int i = 0;i<ints.length-1;i++) {
			ints[i+1] = Integer.parseInt(strings[i]);
		}
		ints[0] = Integer.parseInt(strings[strings.length - 1]);
		scan.close();
		return ints;
	}

}
