package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// record the items in the shop
		int storeStockCount = scan.nextInt();
		String[] storeStock = new String[storeStockCount];
		int[] customersBought = new int[storeStockCount];
		int[] totalBought = new int[storeStockCount];
		for (int i = 0 ; i < storeStockCount ; i++) {
			storeStock[i] = scan.next();
			scan.nextDouble(); // price irrelevant
		}

		int numberCustomers = scan.nextInt();
		
		for (int i = 0 ; i < numberCustomers ; i++) {
			scan.next(); // name irrelevant, must skip
			scan.next();
			int numberItems = scan.nextInt();
					
			boolean[] antiRepeat = new boolean[storeStockCount];
			for (int j = 0 ; j < numberItems ; j++) {
				int itemCount = scan.nextInt();
				String itemName = scan.next();
				if (!antiRepeat[stockIndex(storeStock, itemName)]) {
					customersBought[stockIndex(storeStock, itemName)] += 1;
					antiRepeat[stockIndex(storeStock, itemName)] = true;
				}
				totalBought[stockIndex(storeStock, itemName)] += itemCount;
			}		
		}
		scan.close();
		
		for (int i = 0 ; i < storeStockCount ; i++) {
			if (customersBought[i] == 0) {
				System.out.println("No customers bought " + storeStock[i]);
			} else {
				System.out.println(customersBought[i] + " customers bought " + totalBought[i] + " " + storeStock[i]);
			}
		}					
	}

	
	public static int stockIndex(String[] strarray, String item) {
		// returns the index of a String in String[]
		for (int i = 0 ; i < strarray.length ; i++) {
			if (strarray[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}
}

