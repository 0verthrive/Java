package Model;

public class Student extends People {
	private String registration;
	private Double test, exam;
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public Double getTest() {
		return test;
	}
	public void setTest(Double test) {
		this.test = test;
	}
	public Double getExam() {
		return exam;
	}
	public void setExam(Double exam) {
		this.exam = exam;
	}
	
	public Double getAverage() {
		double Avg = (test + exam)/2;
		
		return Avg;
	}
}
