package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Agenda;

import java.io.IOException;
import java.time.LocalTime;

/**
 * Servlet implementation class AgendaCtrl
 */
@WebServlet("/agenda")
public class AgendaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Agenda agenda;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaCtrl() {
        super();
        agenda = new Agenda();
        System.out.println("Agenda costruita");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//redirect
		//response.sendRedirect("agenda.jsp");
		
		// agenda.addAppuntamento("java");
		// agenda.addAppuntamento("javascript");
		// agenda.addAppuntamento("sql");
		
		request.setAttribute("elencoAppuntamenti", agenda.getAppuntamenti());
		
		//requestDispatcher  smistare la richiesta -> forward o include
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		request.getRequestDispatcher("formAppuntamento.jsp").include(request, response);
		request.getRequestDispatcher("agenda.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String descrizione = request.getParameter("descrizione").equals("")?"---":request.getParameter("descrizione");
		
		if (descrizione.equals("")) {
			descrizione = "---";
		}
		
		if(request.getParameter("ora") != null && !request.getParameter("ora").equals("")) {
			String oraStr= request.getParameter("ora");
			String[] oraMin = oraStr.split(":");
			LocalTime ora = LocalTime.of(Integer.parseInt(oraMin[0]),Integer.parseInt(oraMin[1]));
			agenda.addAppuntamento(descrizione, ora);		
		} else {
			agenda.addAppuntamento(descrizione);
		}
		
		doGet(request, response);
		
	}

}
