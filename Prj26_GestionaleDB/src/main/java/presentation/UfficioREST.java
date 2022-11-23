package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import org.json.JSONArray;

import controller.HubUffici;

/**
 * Servlet implementation class UfficioCtrl
 */

@WebServlet("/uffici")
public class UfficioREST extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HubUffici ctrl = new HubUffici();

	public UfficioREST() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		response.getWriter().append("<h1>Uffici</h1>");

	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
