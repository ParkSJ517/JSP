package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.setCharacterEncoding("utf-8");
				//response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				
				//getParameter메소드로 전송된 회원정보 가져오기
				String user_name = request.getParameter("user_name");
				String user_pwd = request.getParameter("user_pwd");
				
				String data = "안녕하세요!<br> " + user_name + "님 환영합니다.<br><br>";
				data += "<html><body>";
				data += "아이디 :" + user_name + "<br>";
				data += "비밀번호 :" + user_pwd + "<br>";
				data += "</body></html>";
				out.print(data);
	}

}
