package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletConfig1
 */
@WebServlet(urlPatterns = "/demo_config1", initParams = { @WebInitParam
		                                                   (name = "address", value = "CDK,PUNE") 
})
public class MyServletConfig1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServletConfig1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String address = getServletConfig().getInitParameter("address");
		
		String main_office = getServletContext().getInitParameter("head_office");
		
		
		response.getWriter().append(address + ", head office : "+ main_office);
		
	}

}
