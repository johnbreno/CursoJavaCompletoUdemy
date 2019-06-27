package entities;

public class Employee {
	private String name;
	private Integer id;
	private Double salary;
	
	public Employee(String name, Integer id, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
		
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salary;
	}

	public void increaseSalary(Double percent) {
		salary += salary * (percent/100);
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
