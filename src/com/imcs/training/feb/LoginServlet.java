package com.imcs.training.feb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userID = request.getParameter("userID");
		LoginService loginService= new LoginService();
		boolean validUser = loginService.isValidUser(userID);
		
		if(validUser) {
			
			User user = loginService.getUser(userID);
			//response.sendRedirect("success.jsp");
			request.setAttribute("user", user);
			request.getSession().setAttribute("user", user);
			request.getServletContext().setAttribute("user", user);
			
			request.getRequestDispatcher("success.jsp").forward(request, response);
			
		}else {
			response.sendRedirect("login.jsp");
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
