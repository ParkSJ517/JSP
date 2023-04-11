package sec02.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

/**
 * Servlet implementation class SetCookieValue
 */
@WebServlet ("/set2")
public class SetCookieValue2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Date d = new Date();
		
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP Programming.", "utf-8"));
		c.setMaxAge(-1);
		
		response.addCookie(c);
		out.println("����ð� : " + d);
		out.println("<br> ���ڿ��� Cookie�� �����մϴ�.");
	}

}
