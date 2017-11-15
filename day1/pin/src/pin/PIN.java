package pin;
import java.util.Scanner;

public class PIN {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String pin = "12345";

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		
		String entry = keyboard.next();
		while ( !entry.equals(pin) )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.next();
		}
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");

	}

}
