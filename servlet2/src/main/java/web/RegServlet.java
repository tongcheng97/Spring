package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] interest = req.getParameterValues("interest");
		
		
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(sex);
		if(interest != null) {
			for(String i : interest) {
				System.out.println(i);
			}
		}
		resp.setContentType("text/html;charset=utf-8");
		//resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<p>×¢²á³É¹¦</p>");
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	

}
