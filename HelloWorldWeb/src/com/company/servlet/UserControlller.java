package com.company.servlet;

import java.io.IOException;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.model.User;
import com.company.service.UserService;
import com.company.service.UserServiceImpl;

/**
 * Servlet implementation class UserControlller
 */
@WebServlet("/UserControlller")
public class UserControlller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControlller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion=request.getSession();
		String action=request.getParameter("action");
		
		if(action!=null && action.equalsIgnoreCase("Edit"))
		{
			System.out.println("Edit Called");
		}
		else if(action!=null && action.equalsIgnoreCase("Delete"))
		{
			System.out.println("delete Called");
		}
		else if(action!=null && action.equalsIgnoreCase("View"))
		{
			System.out.println("View Called");
		}
		else {
				String id=request.getParameter("id");
				String firstName=request.getParameter("firstName");
				String lastName=request.getParameter("lastName");
				String emailId=request.getParameter("emailId");
				String mobile=request.getParameter("mobile");
				String hobbies[]=request.getParameterValues("hobbies");
				User user=new User(Integer.parseInt(id), firstName, lastName, mobile, emailId);
				UserService userService=new UserServiceImpl();
				userService.saveUser(user);	
				sesion.setAttribute("user", user);
				
				Cookie cookie=new Cookie("mobile",mobile);
				response.addCookie(cookie);
				
				response.sendRedirect("userDetails.jsp");
		}
		
		
	}

}
