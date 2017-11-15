package pin;
import java.util.Scanner;

public class PIN {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		try {
			int entry = keyboard.nextInt();
			while ( entry != pin )
			{
				System.out.println("\nINCORRECT PIN. TRY AGAIN.");
				System.out.print("ENTER YOUR PIN: ");
				entry = keyboard.nextInt();
			}
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		}catch(Exception e) {
			System.out.println("\nERROR.");
		}

	}

}
