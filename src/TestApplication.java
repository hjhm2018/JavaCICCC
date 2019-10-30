import java.util.*;

public class TestApplication {
	static String[] allowedChars_U = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	static ArrayList<String> allowedChars_L = new ArrayList<String>();

	static int[] AllowedNumbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	static String[] AllowedSymbols = { "*", "!", "+", "$" };

	static void genAllowedCars_L() {
		for (int i = 0; i < allowedChars_U.length; i++) {
			allowedChars_L.add(allowedChars_U[i].toLowerCase());
		}
	}

	static String Question2_GenerateRandomWord(int ofLength) {
		String aWord = "";

		do {
			aWord = aWord + GetARandomLetter();
		} while (aWord.length() < ofLength);

		return aWord;
	}
	
	static String Question3_GenerateRandomWord(int minLength, int maxLength) {
		
		
		String aWord = "";
		System.out.println("aWord: " + aWord);
		System.out.println("Need to create a word with a length between " + minLength + " and " + maxLength + " letters.");
		System.out.println("Creating a random number");
		Random rnd = new Random();
		int aNumber = rnd.nextInt(maxLength-minLength);
		System.out.println("Random number is: " + aNumber);
		do {
			aWord = aWord + GetARandomLetter();
		} while (aWord.length() < (minLength+aNumber));

		return aWord;
	}

	static ArrayList<String> Question2b_GenerateRandomWords(int ofLength, int howManyWords)

	{

		ArrayList<String> aList = new ArrayList<String>();

		do

		{

			aList.add(Question2_GenerateRandomWord(ofLength));

		} while (aList.size() < howManyWords);

		return aList;

	}

	static String GetARandomLetter() {
		ArrayList<String> bucket = new ArrayList<String>();

		for (int i = 0; i < allowedChars_U.length; i++) {
			bucket.add(allowedChars_U[i]);
		}

		for (int i = 0; i < allowedChars_L.size(); i++) {
			bucket.add(allowedChars_L.get(i));
		}

		Random rnd = new Random();

		int getFrom = rnd.nextInt(bucket.size());

		return bucket.get(getFrom);
	}

	static void PrintAllCharacters() {

		for (int i = 0; i < allowedChars_L.size(); i++) {
			allowedChars_L.add(allowedChars_L.get(i));
		}

		for (int i = 0; i < allowedChars_U.length; i++) {
			System.out.println(allowedChars_U[i]);
		}
	}
	
//	static int GetARandomNumber() {
//		Random rnd = new Random();
//		return allowedNumbers[rnd.nextInt()];
//	}

	static void GenerateAlphabet() {
		System.out.println("Printing UpperCase Allowed Letters");
		for (int i = 0; i < allowedChars_U.length; i++) {
			System.out.println("allowedChars_U[" + i + "] =" + allowedChars_U[i]);
		}

		System.out.println("Printing LowerCase Allowed Letters");
		for (int i = 0; i < allowedChars_L.size(); i++) {
			System.out.println("allowedChars_L[" + i + "] =" + allowedChars_L.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genAllowedCars_L();

		//GenerateAlphabet();
		
		//Question2b_GenerateRandomWords(10, 10);
		
//		System.out.println(Question2_GenerateRandomWord(10));
//		System.out.println(Question2b_GenerateRandomWords(10, 10));
		
		System.out.println(Question3_GenerateRandomWord(5,10));
		
		
		

	}

}
