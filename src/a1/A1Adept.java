 package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int storeStockCount = scan.nextInt();
		String[] storeStock = new String[storeStockCount];
		double[] storePrices = new double[storeStockCount];
		for (int i = 0; i < storeStockCount ; i++) {
			storeStock[i] = scan.next();
			storePrices[i] = scan.nextDouble();
		}
		
		int numberCustomers = scan.nextInt();
		
		
		// Your code follows here.
		
		scan.close();
	}
	
	
	
	
	// stolen from lec04 example 2 so I could test some stuff out, sorry if I forgot to delete this
	public static void print_array(String label, double[] array_to_print) {
		System.out.print(label + ": ");
		for (int i=0; i<array_to_print.length; i++) {
			System.out.print(array_to_print[i]);

			if (i != array_to_print.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
