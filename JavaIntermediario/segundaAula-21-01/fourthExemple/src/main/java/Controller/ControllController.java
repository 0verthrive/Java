package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;

/**
 * Servlet implementation class ControllController
 */
@WebServlet("/ControllStudent")
public class ControllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Student aluno = new Student();
		aluno.setName(request.getParameter("textName"));
		aluno.setTest(Double.parseDouble(request.getParameter("textTest")));
		aluno.setExam(Double.parseDouble(request.getParameter("textExam")));
		
		request.setAttribute("ObjStudent", aluno);
		
		RequestDispatcher output = request.getRequestDispatcher("Media.jsp");
		
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
