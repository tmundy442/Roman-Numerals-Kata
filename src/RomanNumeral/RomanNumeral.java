package RomanNumeral;

public class RomanNumeral {
	String romanOnes = "";
	String romanTens = "";
	String romanHundreds = "";
	String romanThousands = "";

	public String getOnes(int ones,
			String romanOnes) { /*
								 * assigns integers in hundreds column to the
								 * corresponding Roman Numeral
								 */
		switch (ones) {
		case 0:
			romanOnes = "";
			break;
		case 1:
			romanOnes = "I";
			break;
		case 2:
			romanOnes = "II";
			break;
		case 3:
			romanOnes = "III";
			break;
		case 4:
			romanOnes = "IV";
			break;
		case 5:
			romanOnes = "V";
			break;
		case 6:
			romanOnes = "VI";
			break;
		case 7:
			romanOnes = "VII";
			break;
		case 8:
			romanOnes = "VIII";
			break;
		case 9:
			romanOnes = "IX";
			break;
		}

		return romanOnes;
	}

	public String getTens(int tens,
			String romanTens) { /*
								 * assigns integers in tens column to the
								 * corresponding Roman Numeral
								 */
		switch (tens) {
		case 0:
			romanTens = "";
			break;
		case 1:
			romanTens = "X";
			break;
		case 2:
			romanTens = "XX";
			break;
		case 3:
			romanTens = "XXX";
			break;
		case 4:
			romanTens = "XL";
			break;
		case 5:
			romanTens = "L";
			break;
		case 6:
			romanTens = "LX";
			break;
		case 7:
			romanTens = "LXX";
			break;
		case 8:
			romanTens = "LXXX";
			break;
		case 9:
			romanTens = "XC";
			break;
		}
		return romanTens;
	}

	public String getHundreds(int hundreds,
			String romanHundreds) {/*
									 * assigns integers in hundreds column to
									 * the corresponding Roman Numeral
									 */

		switch (hundreds) {
		case 0:
			romanHundreds = "";
			break;
		case 1:
			romanHundreds = "C";
			break;
		case 2:
			romanHundreds = "CC";
			break;
		case 3:
			romanHundreds = "CCC";
			break;
		case 4:
			romanHundreds = "CD";
			break;
		case 5:
			romanHundreds = "D";
			break;
		case 6:
			romanHundreds = "DC";
			break;
		case 7:
			romanHundreds = "DCC";
			break;
		case 8:
			romanHundreds = "DCCC";
			break;
		case 9:
			romanHundreds = "CM";
			break;
		}

		return romanHundreds;
	}

	public String getThousands(int thousands,
			String romanThousands) { /*
										 * assigns integers in thousands column
										 * to the corresponding Roman Numeral
										 */

		switch (thousands) {
		case 0:
			romanThousands = "";
			break;
		case 1:
			romanThousands = "M";
			break;
		case 2:
			romanThousands = "MM";
			break;
		case 3:
			romanThousands = "MMM";
			break;
		case 4:
			romanThousands = "CV";
			break;
		case 5:
			romanThousands = "V";
			break;
		case 6:
			romanThousands = "VC";
			break;
		case 7:
			romanThousands = "VCC";
			break;
		case 8:
			romanThousands = "VCCC";
			break;
		case 9:
			romanThousands = "VX";
			break;
		}

		return romanThousands;
	}

}
