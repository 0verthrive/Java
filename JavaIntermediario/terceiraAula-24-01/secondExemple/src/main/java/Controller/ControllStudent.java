package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;
import Model.graduateStudent;
import Model.postgraduateStudent;

/**
 * Servlet implementation class ControllStudent
 */
@WebServlet("/Controll2")
public class ControllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student aluno;
		String tipo = request.getParameter("tipoMod");
		if(tipo.equals("Grad"))
			aluno = new graduateStudent();
		else
			aluno = new postgraduateStudent();
		
		aluno.setRegistration(request.getParameter("textRegistration"));
		aluno.setName(request.getParameter("textName"));
		aluno.setTest(Double.parseDouble(request.getParameter("textTest")));
		aluno.setExam(Double.parseDouble(request.getParameter("textExam")));
		
		request.setAttribute("objStudent", aluno);
		RequestDispatcher output = request.getRequestDispatcher("ConsultStd.jsp");
		
		output.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
