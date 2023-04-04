package sec03.ex01;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.List;

/**
 * Servlet implementation class SetServletContext
 */
public class SetServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		
		List member = new ArrayList();
		member.add("박성재");
		member.add(25);
		
		context.setAttribute("member", member);
		
		out.print("<html><body>");
		out.print("박성재 25");
		out.print("</body></html>");
	}

}
