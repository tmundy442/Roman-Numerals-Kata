package RomanNumeral;

import java.util.Scanner;

public class RomanNumeralApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RomanNumeral rom = new RomanNumeral();
		int input;
		String romanOnes = "";
		String romanTens = "";
		String romanHundreds = "";
		String romanThousands = "";

		System.out.println("Welcome to Roman Numeral Converter");
		System.out.println("Type in an integer from 1 to 3,999 and press 'ENTER' to convert to a Roman Numeral");

		do {
			input = scanner.nextInt();

			if (input == 0) { // "0" exits program
				break;
			}

			if (input > 3999) {
				System.out.println("");
				System.out.println("Input out of range ");
				System.out.println("");
				System.out.println("Enter another integer or '0' to quit");

			} else { // separate input integer into columns: ones, tens, etc

				int ones = input % 10;
				int tens = input / 10 % 10;
				int hundreds = input / 100 % 10;
				int thousands = input / 1000 % 10;

				// calls to conversion switch statements
				romanOnes = rom.getOnes(ones, romanOnes);
				romanTens = rom.getTens(tens, romanTens);
				romanHundreds = rom.getHundreds(hundreds, romanHundreds);
				romanThousands = rom.getThousands(thousands, romanThousands);

				System.out.println("");
				System.out.println(input + " in Roman Numeral notation is " + romanThousands + romanHundreds + romanTens
						+ romanOnes);
				System.out.println("");
				System.out.println("Enter another integer or '0' to quit");
			}
		} while (input != 0);

		System.out.println("");
		System.out.println("Goodbye");
		scanner.close();
		System.exit(0);
	}

}
