package application;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductVectorReference;

public class ProgramVectorReference {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the quantity of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		ProductVectorReference[] vectProduct = new ProductVectorReference[n];
		
		double sum = 0.0;
		
		for (int i=0; i<vectProduct.length; i++) {
			System.out.println("Product " + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.println("---------------------");
			sc.nextLine();
			
			vectProduct[i] = new ProductVectorReference(name, price);
			
			sum += vectProduct[i].getPrice();
		}
		
//		double sum = 0.0;
		
//		for (int i=0; i < vectProduct.length; i++) {
//			sum += vectProduct[i].getPrice();
//		}
		
		double avg = sum / vectProduct.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
