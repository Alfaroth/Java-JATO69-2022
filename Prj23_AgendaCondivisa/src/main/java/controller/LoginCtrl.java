package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginCtrl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Mi hai chiamato via Get");
		
		// resp.setContentType("text/html");	// MIME (Multipurpose Internet Mail Extensions) type
		// resp.getWriter().append("<h1>Ciao, sono il metodo Get</h1>");
		
		// resp.sendRedirect("formLogin.jsp");
		
		req.getRequestDispatcher("header.jsp").include(req, resp);
		req.getRequestDispatcher("formLogin.jsp").include(req, resp);
		req.getRequestDispatcher("footer.jsp").include(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (username.equals("Dave") && password.equals("666")) {
			
			req.getRequestDispatcher("header.jsp").include(req, resp);;
			req.getRequestDispatcher("areaRiservata.jsp").include(req, resp);;
			req.getRequestDispatcher("footer.jsp").include(req, resp);;
			
			//resp.sendRedirect("areaRiservata.jsp");
			
		} else {
			doGet(req, resp); // rimando nuovamente al metodo doGet se i dati login sono errati
		}
		
		// System.out.println("Mi hai chiamato via Post, " + username);

	}

}
