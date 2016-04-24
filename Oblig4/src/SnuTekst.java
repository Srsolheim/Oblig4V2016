import java.util.Scanner;

public class SnuTekst {
	static int teller = 0;
	
public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	String input;
	System.out.println("Skriv inn en string: ");
	input = scanner.nextLine();
	System.out.println(baklengs(input));
}

public static String baklengs(String tekst){
	if (tekst.length() == 1){
		System.out.println("Antall tegn: " + teller);
		return tekst;
	}
	teller++;
	return baklengs(tekst.substring(1)) + tekst.charAt(0);
}

public static void baklengs(String tekst, int siste){
	baklengs(tekst.substring(0, siste));
}
}