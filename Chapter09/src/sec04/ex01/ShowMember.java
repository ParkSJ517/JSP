package sec04.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ShowMember
 */
public class ShowMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id ="", pwd ="" ;
		Boolean isLogon = false;
		HttpSession session = request.getSession(false);
		
		if (session != null) {
			isLogon = (Boolean)session.getAttribute("isLogon");
			
			if (isLogon == true) {
				id = (String)session.getAttribute("login.id");
				pwd = (String)session.getAttribute("login.pwd");
				
				out.print("<html><body>");
				out.print("아이디: " + id + "<br>");
				out.print("비밀번호: " + pwd + "<br>");
				out.print("</body></html>");
			} else {
				response.sendRedirect("login4.html");
			}
		} else {
			response.sendRedirect("login4.html");
		}
	}
}
