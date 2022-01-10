package pattern;
import java.util.Scanner;

public class Printthepattern {
	public static void printPattern(int n) {

		// Write your code here

		// Print odd sequences
		for (int i = 1; i <= n; i = i + 2) {
			for (int j = ((n * i) - (n - 1)); j <= (n * i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Print even sequences
		int MaxEven = ((n % 2) == 0)?n:(n-1);
		for (int i = MaxEven; i > 1; i = i - 2) {
			for (int j = ((n * i) - (n - 1)); j <= (n * i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

}
