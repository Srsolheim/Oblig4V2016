import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall disker: ");
		int n = input.nextInt();

		System.out.println("Flyttene er:");
		flyttDisk(n, 'A', 'B', 'C');
	}

	public static void flyttDisk(int n, char fraT�rn, char tilT�rn, char auxT�rn) {
		if (n == 1)
			System.out.println("Flytt disk " + n + " fra " + fraT�rn + " til " + tilT�rn);
		else {
			flyttDisk(n - 1, fraT�rn, auxT�rn, tilT�rn);
			System.out.println("Flytt disk " + n + " fra " + fraT�rn + " til " + tilT�rn);
			flyttDisk(n - 1, auxT�rn, tilT�rn, fraT�rn);
		}
	}

}
