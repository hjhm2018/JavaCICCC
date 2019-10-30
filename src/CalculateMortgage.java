import java.util.Scanner;
public class CalculateMortgage {

	public static void main(String[] args) {
		// Calculate Mortgage
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tell me the principal amount ($): ");
		
		double principal = input.nextDouble();
		
		System.out.print("Tell me the yearly rate (%): ");
		double yearlyRate = input.nextDouble();
		
		System.out.print("Tell me the mortgage duration (years): ");
		double mortgageDuration = input.nextDouble();
		
		//Calculate Monthly Rate
		
		double monthlyRate = (yearlyRate/100)/12;
		
		// Calculate Number of Payments
		
		double numberOfPayments = mortgageDuration * 12;
		
		// Calculate Monthly Payment
		
		double monthlyPayment = principal * ((monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))/(Math.pow(1 + monthlyRate, numberOfPayments) - 1));
		
		// Calculate Total Mortgage: 30 years, 12 months per year
		
		double totalMortgage = monthlyPayment * 30 * 12;
		
		input.close();
		
//		System.out.println(principal);
//		System.out.println(yearlyRate);
//		System.out.println(mortgageDuration);
		
		System.out.println("The monthly rate equals to: " +  monthlyRate + " for a "+ yearlyRate + "% yearly rate.");
		System.out.println("The monthly payment equals to : " + monthlyPayment + " $.");
		System.out.println("The total amount paid at the end of 30 years will be: " + totalMortgage + " $.");
		

	}

}
