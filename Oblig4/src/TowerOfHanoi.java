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

	public static void flyttDisk(int n, char fraTårn, char tilTårn, char auxTårn) {
		if (n == 1){
			flytt++;
			System.out.println("Flytt disk " + n + " fra " + fraTårn + " til " + tilTårn);}
		else {
			kall++;
			flyttDisk(n - 1, fraTårn, auxTårn, tilTårn);
			flytt++;
			System.out.println("Flytt disk " + n + " fra " + fraTårn + " til " + tilTårn);
			kall++;
			flyttDisk(n - 1, auxTårn, tilTårn, fraTårn);
			n++;
		}
	}
}

