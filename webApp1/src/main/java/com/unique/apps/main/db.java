package com.unique.apps.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.unique.apps.Employee;

/**
 * Servlet implementation class db
 */
public class db extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public db() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");//setting the content type  
		PrintWriter pw=response.getWriter();//get the stream to write the data  
		  
		pw.println("<html><body align='center'>");  
		pw.println("<h1>Welcome to  Registeration Form</h1>");  
		pw.print("<form action='' method='post' > ");
		pw.print("<input type='text' name='fname' placeholder='First Name'> &nbsp; ");
		pw.print("<input type='text' name='lname' placeholder='Last Name'> &nbsp; ");
		pw.print("<input type='submit' name='submit'>");
		pw.print("</form>");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		 SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		 Session session = factory.openSession();  
		 Transaction t = session.beginTransaction();  
		 
		Query query = session.createQuery("FROM Employee");
		List<Employee> emp = query.list();
		
		pw.println("<h1>");
		pw.print("<table align='center' border >");
		pw.print("<thead>");
		pw.print("<th>Id</th>");
		pw.print("<th>First Name</th>");
		pw.print("<th>Last Name</th>");
		pw.print("<th>Operation</th>");
		pw.print("</thead>");
		pw.print("<tbody>");
		
		for (Employee empObj : emp) {
		pw.print("<tr>");
		pw.print("<td>" + empObj.getId() + "</td>");
		pw.print("<td>" + empObj.getFname() + "</td>");
		pw.print("<td>" + empObj.getLname() + "</td>");
		pw.print("<td><a href='delete?id="+empObj.getId()+"'>Delete</a></td>");
		pw.print("</tr>");
		}
			
		pw.print("</tbody>");
		pw.print("<table>");
		pw.println("</h1>");
		pw.println("</body></html>"); 
		
		
		if(request.getParameter("submit")!=null)
		{
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			 Employee e = new Employee();
			 e.setFname(fname);
			 e.setLname(lname);
			 session.save(e);
			 t.commit();
			 session.close();
			 pw.print("SuccessFully Saved");
			 response.sendRedirect("db");
		}
			

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
