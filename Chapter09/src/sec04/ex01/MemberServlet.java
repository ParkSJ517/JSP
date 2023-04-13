package sec04.ex01;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/memberServlet7")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(req, resp);
	}
	
	protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		MemberDAO dao = new MemberDAO();
		
		String command = req.getParameter("command");
		if(command != null && command.equals("addMember")) {
			String _id = req.getParameter("id");
			String _pwd = req.getParameter("pwd");
			String _name = req.getParameter("name");
			String _email = req.getParameter("email");
			
			MemberVO vo = new MemberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
		dao.addMember(vo);
		} else if(command != null && command.equals("delMember")) {
			String id = req.getParameter("id");
			dao.delMember(id);
		}
		
		List membersList = dao.listMembers();
		
		req.setAttribute("membersList", membersList);
		RequestDispatcher dispatch = req.getRequestDispatcher("viewMembers");
		dispatch.forward(req, resp);
	}
}
