package ex201895039;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalcServlet
 */
public class CalcServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(req, resp);
	}

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(req, resp);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String num1 = request.getParameter("num1");
		String op = request.getParameter("op");
		String num2 = request.getParameter("num2");
		String result = calculate(Float.parseFloat(num1), op, Float.parseFloat(num2));
		
		String data = "<html><font size=10>중간고사 1번 박성재 - 결과</font><br>";
		data += "<body>";
		data += num1;
		data += op;
		data += num2;
		data += " = ";
		data += result;
		data += "</body>";
		data += "</html>";
		out.print(data);
	}
	private static String calculate(float num1, String operator, float num2) {
		String result = null;
		if (operator.equals("+")) {
			result = String.format("%.2f", num1 + num2);
		}
		else if (operator.equals("-")) {
			result = String.format("%.2f", num1 - num2);
		}
		else if (operator.equals("*")) {
			result = String.format("%.2f", num1 * num2);
		}
		else if (operator.equals("/")) {
			result = String.format("%.2f", num1 / num2);
		}
		return result;
	}
	
}
