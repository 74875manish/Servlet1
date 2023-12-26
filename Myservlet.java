package day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class Myservlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myname =req.getParameter("name1");
		String myemail =req.getParameter("email1");
		
		System.out.println("Name1" +myname);
		System.out.println("Email1" +myemail);
		
		PrintWriter out = resp.getWriter();
		out.print("Name1 :" +myname);
		out.print("Email1 :" +myemail);
		
		
		
		
	}

}
