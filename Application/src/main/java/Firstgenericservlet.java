

import jakarta.servlet.GenericServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Firstgenericservlet")
public class Firstgenericservlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		int n1=Integer.parseInt(request.getParameter("fn"));
		int n2=Integer.parseInt(request.getParameter("sn"));
		int sum=n1+n2;
		PrintWriter out=response.getWriter();
		out.print("result is="+sum);
	}

}
