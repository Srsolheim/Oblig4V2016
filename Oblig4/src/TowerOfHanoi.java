import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall disker: ");
		int n = input.nextInt();

		System.out.println("Flyttene er:");
		flyttDisk(n, 'A', 'B', 'C');
	}

	public static void flyttDisk(int n, char fraTårn, char tilTårn, char auxTårn) {
		if (n == 1)
			System.out.println("Flytt disk " + n + " fra " + fraTårn + " til " + tilTårn);
		else {
			flyttDisk(n - 1, fraTårn, auxTårn, tilTårn);
			System.out.println("Flytt disk " + n + " fra " + fraTårn + " til " + tilTårn);
			flyttDisk(n - 1, auxTårn, tilTårn, fraTårn);
		}
	}

}
