package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Employee;

/**
 * Servlet implementation class ControllController
 */
@WebServlet("/ControllEmployee")
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
		Employee func = new Employee();
		func.setName(request.getParameter("textName"));
		func.setRegistration(Integer.parseInt(request.getParameter("textReg")));
		func.setGrossSalary(Double.parseDouble(request.getParameter("textGS")));
		
		request.setAttribute("ObjEmployee", func);
		
		RequestDispatcher output = request.getRequestDispatcher("Result.jsp");
		
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
