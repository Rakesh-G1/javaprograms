
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/Firsthttp")
public class Firsthttp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno=Integer.parseInt(request.getParameter("sno"));
		String stname=request.getParameter("sname");
		int marks=Integer.parseInt(request.getParameter("marks"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/coding","root","1999");
			Statement st= con.createStatement();
			String sql="insert into student values("+rollno+",'"+stname+"',"+marks+")";
			st.executeQuery(sql);
			PrintWriter out=response.getWriter();
			out.print("inserted successfully");
;		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
