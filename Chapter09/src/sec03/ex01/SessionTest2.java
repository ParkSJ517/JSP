package sec03.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class SessionTest2
 */
public class SessionTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		out.println("���� ���̵� : " + session.getId() + "<br>");
		out.println("���� ���� ���� �ð� : " + new Date(session.getCreationTime()) + "<br>");
		out.println("�ֱ� ���� ���� �ð� : " + new Date(session.getLastAccessedTime()) + "<br>");
		out.println("���� ���� �ð� : " + session.getMaxInactiveInterval() + "<br>");
		
		session.setMaxInactiveInterval(5);
		
		if(session.isNew()) {
			out.print("�� ������ ����������ϴ�.");
		}
	}

}
