
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/First")
public class First implements Servlet
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String first=request.getParameter("fname");
		String last=request.getParameter("lname");
		PrintWriter out=response.getWriter();//response
		out.println(first+last);//;
	}
	public void destroy() {
		
	}

	public ServletConfig getServletConfig() {
	
		return null;
	}
	public String getServletInfo() {
		return null;
	}
	public void init(ServletConfig config) throws ServletException {
		
	}
	
}

