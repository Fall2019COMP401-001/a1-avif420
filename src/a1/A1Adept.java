 package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
// record the items in the shop
		int storeStockCount = scan.nextInt();
		String[] storeStock = new String[storeStockCount];
		double[] storePrices = new double[storeStockCount];
		for (int i = 0 ; i < storeStockCount ; i++) {
			storeStock[i] = scan.next();
			storePrices[i] = scan.nextDouble();
		}

		int numberCustomers = scan.nextInt();
		double[] customerCosts = new double[numberCustomers];
		String[] customerList = new String[numberCustomers];
		
		for (int i = 0 ; i < numberCustomers ; i++) {
			// for each customer, check their name and initialize
			customerList[i] = scan.next() + " " + scan.next();
			int numberItems = scan.nextInt();
			double personalCost = 0;
			
			

			for (int j = 0 ; j < numberItems ; j++) {
				// for each item, calculate cost
				int itemCount = scan.nextInt();
				String itemName = scan.next(); 
				personalCost += itemCount * storePrices[stockIndex(storeStock, itemName)];
			}

			customerCosts[i] = personalCost;
			
		}
		scan.close();

		double largePersonPrice = maxi(customerCosts);
		System.out.println("Biggest: " + customerList[identifyPosition(customerCosts, largePersonPrice)] +
				" (" + String.format("%.2f", largePersonPrice) + ")");
		
		
		double smallPersonPrice = mini(customerCosts);
		System.out.println("Smallest: " + customerList[identifyPosition(customerCosts, smallPersonPrice)] + 
				" (" + String.format("%.2f", smallPersonPrice) + ")");
		
		
		System.out.println("Average: " + String.format("%.2f", average(customerCosts)));
		
	}
	
	public static double average(double[] array) {
		double avarice = 0 ;
		for (int i = 0 ; i < array.length ; i++) {
			avarice += array[i];
		}
		avarice = avarice / array.length;
		return avarice;
	}
	
	public static double mini(double[] array) {
		
		double minimum = Long.MAX_VALUE; // setting this to zero is okay because the input for this function is money

		for (int i = 0 ; i < array.length ; i++) {
			minimum = Math.min(minimum, array[i]);
		}
		return minimum;
	}
	
	public static double maxi(double[] array) {
		
		double maximum = Long.MIN_VALUE; 
		
		for (int i = 0 ; i < array.length ; i++) {
			maximum = Math.max(maximum, array[i]);
		}
		return maximum;
	}
	
	public static int identifyPosition(double[] dbarray, double item) {
		for (int i = 0 ; i < dbarray.length ; i++) {
//			System.out.println(dbarray[i]);
//			System.out.println(item);
			if (dbarray[i] == item) {
				return i;
			}
		}
		
		return -1;
	}

	
	public static int stockIndex(String[] strarray, String item) {
		for (int i = 0 ; i < strarray.length ; i++) {
			if (strarray[i].equals(item)) {
				return i;
			}
		}
		
		return -1;
	}
}
	