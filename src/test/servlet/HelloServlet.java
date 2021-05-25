package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String encoding=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getHeader("User-Agent");
		System.out.println(user);
		
		resp.setCharacterEncoding(encoding);
		PrintWriter out=resp.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>HI</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("sus");
		out.write("</body>");
		out.write("</html>");
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid=req.getParameter("userid");
		String pwd=req.getParameter("pwd");
		String[] cbs=req.getParameterValues("cb");
		for(String cb:cbs) {
			System.out.println(cb);
		}
		
		resp.setCharacterEncoding(encoding);
		PrintWriter out=resp.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>HI</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("登录账号是:"+userid+",密码是:"+pwd);
		out.write("</body>");
		out.write("</html>");
		out.flush();
		out.close();
	}
	public  HelloServlet() {
		
		
	}

	@Override
	public void init() throws ServletException {
	 encoding=this.getInitParameter("encoding");
	 System.out.println("encoding="+encoding);
	}
	
}
