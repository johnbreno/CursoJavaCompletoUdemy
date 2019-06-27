package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCâmbio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double cuotation = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		double amount = CurrencyConverter.conversor(cuotation, dollars);
		
		System.out.printf("Amount to be paid in reais = %.2f", amount);
		
		sc.close();
		
	}

}
