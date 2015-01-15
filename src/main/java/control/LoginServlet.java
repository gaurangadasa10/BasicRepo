package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Authenticate;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     	String un = request.getParameter("un");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		Authenticate aut = new Authenticate();
		boolean valid = aut.auth(un, pw);
		if(valid) {
			out.print("success");
		} else {
			out.println("failure");
		}	
	}

}
