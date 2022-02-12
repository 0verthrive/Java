package Model;

public class graduateStudent extends Student {
	public Double getAvg() {
		return(getTest()+getExam()*2)/3;
	}
}
