package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the data of student: ");
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Test score #1: ");
		student.testScore1 = sc.nextDouble();
		
		System.out.print("Test score #2: ");
		student.testScore2 = sc.nextDouble();	
		
		System.out.print("Test score #3: ");
		student.testScore3 = sc.nextDouble();
		
		System.out.println();
		
		student.status();
		
		sc.close();
		
	}

}
