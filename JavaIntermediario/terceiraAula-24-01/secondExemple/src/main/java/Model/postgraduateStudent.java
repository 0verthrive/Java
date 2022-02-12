package Model;

public class postgraduateStudent extends Student{
	
	public Double getAvg() {
		return(getTest()+getExam())/2;
	}

}
