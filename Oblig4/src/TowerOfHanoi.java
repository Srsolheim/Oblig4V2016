import java.util.Scanner;

public class TowerOfHanoi {
	static int flytt = 0;
	static int kall = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall disker: ");
		int n = input.nextInt();

		System.out.println("Flyttene er:");
		flyttDisk(n, 'A', 'B', 'C');
		System.out.println("Antall flytt: " + flytt);
		System.out.println("Antall kall: " + kall);
	}

	public static void flyttDisk(int n, char fraT�rn, char tilT�rn, char auxT�rn) {
		if (n == 1){
			flytt++;
			System.out.println("Flytt disk " + n + " fra " + fraT�rn + " til " + tilT�rn);}
		else {
			kall++;
			flyttDisk(n - 1, fraT�rn, auxT�rn, tilT�rn);
			flytt++;
			System.out.println("Flytt disk " + n + " fra " + fraT�rn + " til " + tilT�rn);
			kall++;
			flyttDisk(n - 1, auxT�rn, tilT�rn, fraT�rn);
			n++;
		}
	}
}

