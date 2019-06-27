package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Account account;
				
		System.out.println("----- ABERTURA DE CONTA -----");
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();	

		System.out.print("You would like to do a inittial deposit? (y/n): ");
		char option = sc.next().charAt(0);
		
		while (option != 'y' && option != 'n' && option != 'Y' && option != 'N') {
			System.out.println();
			System.out.println("Invalid option! Try again. ");
			System.out.print("You would like to do a inittial deposit? (y/n): ");
			option = sc.next().charAt(0);
		}
		
		if (option == 'y' || option == 'Y') {
			System.out.println();
			System.out.print("How much would you like to deposit?: ");
			double inittialValue = sc.nextDouble();
			
			account = new Account(number, holder, inittialValue);
		} 
		else {
			
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdrawal(amount);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
		
	}

}
