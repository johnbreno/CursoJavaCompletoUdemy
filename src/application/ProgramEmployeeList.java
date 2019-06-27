package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployeeList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employeers will be registered? ");
		int quantity = sc.nextInt();

		System.out.println("");

		List<Employee> employeerList = new ArrayList<>();

		for (int i = 1; i <= quantity; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee employee = new Employee(name, id, salary);

			employeerList.add(employee);

			System.out.println("");
		}

		System.out.println("-------------------------------------");
		System.out.print("Enter the employee id that will have salary increase : ");
		Integer employeeId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the percentage: ");
		Double percent = sc.nextDouble();

		Employee employeeFind = employeerList.stream().filter(x -> x.getId().equals(employeeId)).findFirst().orElse(null);

		if (employeeFind != null) {
			employeeFind.increaseSalary(percent);
			System.out.println("-------------------------------------");
			System.out.println("List of employees: ");
			System.out.println("");
			for (Employee list : employeerList) {
				System.out.println(list.toString());
			}
		} else {
			System.out.println("-------------------------------------");
			System.out.println("This id does not exist!");
			System.out.println("");
			System.out.println("List of employees: ");
			System.out.println("");
			for (Employee list : employeerList) {
				System.out.println(list.toString());
			}
		};

		sc.close();

	}
}
