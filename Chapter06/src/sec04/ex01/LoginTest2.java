package sec04.ex01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginTest2
 */
public class LoginTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init �޼��� ȣ��");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy �޼��� ȣ��");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("���̵�   : " + id);
		System.out.println("�н�����  : " + pw);
		
		if(id != null &&(id.length() != 0)) {
			if(id.equals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<font size='12'>�����ڷ� �α��� �ϼ̽��ϴ�!! </font>");
				out.print("<br>");
				out.print("<input type=button value='ȸ������ �����ϱ�' />");
				out.print("<input type=button value='ȸ������ �����ϱ�' />");
				out.print("</body>");
				out.print("</html>");
			}
			else {
			out.print("<html>");
			out.print("<body>");
			out.print(id + "��!! �α��� �ϼ̽��ϴ�.");
			out.print("</body>");
			out.print("</html>");
			}
		}
		else {
			out.print("<html>");
			out.print("<body>");
			out.print("���̵� �Է��ϼ���!!!");
			out.print("<br>");
			out.print("<a href='http://localhost:8090/Chapter06/test01/login2.html'> �α��� â���� �̵� </a>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
