This is a program to convert integers to Roman Numerals. It was written in Java, in the Eclipse IDE.

Upon starting, the user is prompted in the console to enter an integer from 1 to 3,999, which is then converted to its Roman Numeral equivalent. The user can enter another integer, or '0' to exit the program.

The entered integer is broken into its ones, tens, hundreds and thousands columns by dividing with a modulus of 10. Each column is then converted to its Roman Numeral equivalent with a switch statement called in the RomanNumeral class. The Roman Numeral is then returned to the RomanNumeralApp and output to the console.