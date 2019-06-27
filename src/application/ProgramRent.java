package application;

import java.util.Scanner;

import entities.Rent;

public class ProgramRent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rent[] rentVect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int numberRooms = sc.nextInt();
		
		while (numberRooms < 1 || numberRooms > 10) {
			if (numberRooms > 10) {
				System.out.println();
				System.out.println("There is no rooms enought, only 10! Try again. ");
				System.out.print("How many rooms will be rented? ");
				numberRooms = sc.nextInt();
			} else {
				System.out.println();
				System.out.println("Chose 1 or more. Try again. ");
				System.out.print("How many rooms will be rented? ");
				numberRooms = sc.nextInt();
			}
		}

		for (int i = 0; i < numberRooms; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room (0 - 9): ");
			int room = sc.nextInt();

			while (room < 0 || room > 9) {
				System.out.println();
				System.out.printf("Chose a room between 0 and 9: ");
				room = sc.nextInt();
				sc.nextLine();
			}
			
			while (rentVect[room] != null) {
				System.out.printf("Room is busy. Chose another room: ");
				room = sc.nextInt();
				sc.nextLine();
			}
			
			rentVect[room] = new Rent(name, email, room);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (rentVect[i] != null) {
				System.out.println(rentVect[i]);
			}
		}

		sc.close();

	}

}
