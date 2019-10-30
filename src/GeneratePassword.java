import java.util.*;

public class GeneratePassword {

	static String alphabetUpperCase = "";
	static String alphabetLowerCase = "";
	static String symbols = "";
	static String allStrings;
	static String randomStrings = "";
	static String allowedSymbols = "!#$%&*<=>?@^|~";
	static String numbers = "0123456789";
	
	//Method to create a string with the alphabet with uppercase letters 
	static String generateAlphabetUC(){
		for (int i = 65; i <= 90; i++){

			alphabetUpperCase = alphabetUpperCase + (char) i;
		}
	  return alphabetUpperCase;
	}
	
	//Method to create a string with the alphabet with lowercase letters
	static String generateAlphabetLC(){
		for (int i = 97; i <= 122; i++){

			alphabetLowerCase = alphabetLowerCase + (char) i;
		}
	  return alphabetLowerCase;
	}
	
	//Method to create a string only with symbols 
	static String generateSymbolsString(){
		for (int i = 33; i <= 47; i++){
			
			symbols = symbols + (char) i;
		}
	  return symbols;
	}
	
	//Method to create a password with a random word
	static String GeneratePassWord(int passLength){
		generateAlphabetUC();
		generateAlphabetLC();
		
		Random rand = new Random();
		
		allStrings = alphabetUpperCase + alphabetLowerCase + allowedSymbols + numbers;
		
		for (int i = 0; i <= passLength; i++){

			randomStrings = randomStrings + allStrings.charAt(rand.nextInt(allStrings.length()));
		}
		
		return randomStrings;
			
	}
	
	public static void main(String[] args) {
		//An empty string
		String aString = "";
		
		//Random number 
		Random rand = new Random();
		
		//These values is the range of random numbers
		int max = 90;
		int min = 65;

		// This is a way to get random numbers within a range

		// int randomNumber = rand.nextInt((max - min) + 1) + min;

		// System.out.println("Random number is: " + randomNumber);

		for (int i = 0; i < 5; i++) {
			// System.out.println((char) Math.floor(Math.random() * 100));

			aString = aString + (char) (rand.nextInt((max - min) + 1) + min);
		}

		System.out.println("This a random generated word: " + aString);
		
		//Printing the outputs of the different methods
		System.out.println("Uppercase letters: " + generateAlphabetUC());
		System.out.println("Lowercase letters: " + generateAlphabetLC());
		System.out.println("Symbols from Ascii table: " + generateSymbolsString());
		
		//Printing the random password assigning the length of the word as a parameter
		System.out.println("The random generated password is: " + GeneratePassWord(7));
	}

}
