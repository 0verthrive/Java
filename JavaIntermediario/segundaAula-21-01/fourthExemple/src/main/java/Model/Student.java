package Model;

public class Student {
	private String name;
	private Double test, exam;
	
	public Student() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public double getMedia() {
		return (test+exam)/2;
	}
	
}
