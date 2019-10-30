import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		// I used Scanner to ask for a word as an input
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a word to check if is a palindrome:");
		
		String aString = myObj.nextLine();
		
		//An empty string to save reversed version of the entered letter
		String bString= "";
		
		//This loop reverses the original word
		for(int i=aString.length() -1; i >= 0 ; i--) {
			bString = bString+ aString.charAt(i);
		}
		
		//This conditional checks if the reversed word and the original are the same
		// The method equals is used to compare both strings
		if(aString.equals(bString)) {
			System.out.println("The word " + aString+  " is a palindrome");
		}else {
			System.out.println("The word " + aString+ " is not a palindrome");
		}
		
		//The Scanner is closed
		myObj.close();
	}

}
