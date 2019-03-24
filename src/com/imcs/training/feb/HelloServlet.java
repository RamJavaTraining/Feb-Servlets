package com.imcs.training.feb;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String userID = request.getParameter("userID");
		//String firstName = request.getParameter("firstName");
		//String lastName = request.getParameter("lastName");
		
		HttpSession httpSession = request.getSession();
		ServletContext servletContext = request.getServletContext();
		if(userID!=null && !userID.isEmpty()) {
			httpSession.setAttribute("sessionUserID", userID);
			servletContext.setAttribute("contextUserID", userID);
		}
		
		HelloService helloService= new HelloService();
		
		if(helloService.isValidUser(userID))
		{
			User user = helloService.getUser(userID);
			
		// TODO Auto-generated method stub
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h3>Hello Servlet GET </h3>");
		response.getWriter().println("<br>");
		response.getWriter().println("Session User ID:"+httpSession.getAttribute("sessionUserID"));
		response.getWriter().println("Context User ID:"+servletContext.getAttribute("contextUserID"));
		response.getWriter().println("<br>");
		
		response.getWriter().println("User ID:" + user.getUserID());
		response.getWriter().println("<br>");
		response.getWriter().println("First Name:" + user.getFristName());
		response.getWriter().println("<br>");
		response.getWriter().println("Last Name:" + user.getLastName());
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
		}else
		response.getWriter().println("Invlaid User");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		String userID = request.getParameter("userID");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		
		
		// TODO Auto-generated method stub
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h3>Hello Servlet  POST </h3>");
		response.getWriter().println("<br>");
		response.getWriter().println("User ID:" + userID);
		response.getWriter().println("<br>");
		response.getWriter().println("First Name:" + firstName);
		response.getWriter().println("<br>");
		response.getWriter().println("Last Name:" + lastName);
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
	}

}
