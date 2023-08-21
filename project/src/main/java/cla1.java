import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class cla1 extends HttpServlet
{
	protected void post(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		String first=req.getParameter("first");
		String last=req.getParameter("last");
		String con=req.getParameter("con");
		String em=req.getParameter("em");
		String pass=req.getParameter("pass");
	}
}
