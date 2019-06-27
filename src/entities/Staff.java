package entities;

public class Staff {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return (grossSalary - tax);
	}

	public void IncreaseSalary(double percentage) {
		grossSalary = (grossSalary * (1 + (percentage / 100)));
	}
	
	public String toString() {
		return (name + ", $ " + String.format("%.2f", netSalary()));
	}

}
