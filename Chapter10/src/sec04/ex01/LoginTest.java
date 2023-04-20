package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login2")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.setCharacterEncoding("utf-8");
		//response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
				
		//getParameter메소드로 전송된 회원정보 가져오기
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		
		LoginImpl loginUser = new LoginImpl(user_id, user_pwd);
		if(session.isNew()) {
			session.setAttribute("loginUser", loginUser);
		}
		
		out.println("<html><head>");
		out.println("<script type='text/javascript'>");
		out.println("setTimeout('history.go(0);' 5000)");
		out.println("</script>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("아이디 " +  loginUser.user_id + "<br>");
		out.println("총 접속자수 : " + LoginImpl.total_user + "<br>");
		out.println("</head></html>");
		
		
		String data = "안녕하세요!<br> " + user_id + "님 환영합니다.<br><br>";
		data += "<html><body>";
		data += "아이디 :" + user_id + "<br>";
		data += "비밀번호 :" + user_pwd + "<br>";
		data += "</body></html>";
		out.print(data);
	}

}
