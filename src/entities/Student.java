package entities;

public class Student {

	public String name;
	public double testScore1;
	public double testScore2;
	public double testScore3;

	public double scoreSum() {
		return (testScore1 + testScore2 + testScore3);
	}

	public void status() {

		if (scoreSum() >= 60.0) {
			System.out.println("FINAL GRADE: " + scoreSum());
			System.out.println("PASS");
		} 
		else {
			System.out.println("FINAL GRADE: " + scoreSum());
			System.out.println("FAILED");
			System.out.println("MISSING " + (60.0 - scoreSum()) + " POINTS");
		}
	}

}
