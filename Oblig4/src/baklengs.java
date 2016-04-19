import java.util.Scanner;

public class baklengs {
public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	String input;
	System.out.println("Skriv inn en string: ");
	input = keyboard.nextLine();
	System.out.println(baklengs(input));
}

public static String baklengs(String tekst){
	if (tekst.length() == 1){
		return tekst;
	}
	return baklengs(tekst.substring(1)) + tekst.charAt(0);
}
}