import java.util.*;
public class Keyboard {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Would you like to exit? (Yes/No)");
		
		String answer = console.nextLine();
		
		if(answer.equals("Yes")) {
			System.out.println("See you later!");
			System.exit(0);
		}else {
			System.out.println("So good you\'re staying!");
		}
		
		console.close();
	}

}
