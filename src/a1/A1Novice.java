package a1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numberCustomers = scan.nextInt();
		String[] finalOutput = new String[numberCustomers];

		
		for (int i = 0 ; i < numberCustomers ; i++) {
			// for each customer, check their name and initialize
			String firstName = scan.next();
			String lastName = scan.next();
			int numberItems = scan.nextInt();
			double personalCost = 0;
			
			

			for (int j = 0 ; j < numberItems ; j++) {
				// for each item, calculate cost
				int itemCount = scan.nextInt();
				scan.next(); // name of item is irrelevant
				double itemPrice = scan.nextDouble();
				personalCost += itemCount * itemPrice ;
			}
			
			
			finalOutput[i] = Character.toString(firstName.charAt(0)) + ". " + lastName + ": " + 
					String.format("%.2f", personalCost);

			
		}

		scan.close();
		
		for (int k = 0 ; k < finalOutput.length ; k++) {
			System.out.println(finalOutput[k]);
		}
		
		
	}
}
