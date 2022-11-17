package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Agenda;

import java.io.IOException;
import java.time.LocalTime;

/**
 * Servlet implementation class AgendaCtrl
 */
@WebServlet("/agenda")
public class AgendaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Agenda agenda = new Agenda();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaCtrl() {
        super();
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
		
		HttpSession session = request.getSession();
		
		//requestDispatcher  smistare la richiesta -> forward o include
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		if (session.getAttribute("loggato")!=null && session.getAttribute("loggato").equals("ok") ) {
			
			System.out.println("Sei loggato");
			request.setAttribute("elencoAppuntamenti", agenda.getAppuntamenti());
			
			request.getRequestDispatcher("formAppuntamento.jsp").include(request, response);
			request.getRequestDispatcher("agenda.jsp").include(request, response);
			
		} else {
			response.getWriter().append("<h1> Non puoi entrare, rifai il login </h1>");
		}
				
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String descrizione = request.getParameter("descrizione");
		if(descrizione.equals("")) {
			descrizione="---";
		}
		
		if (request.getParameter("ora")!=null && !request.getParameter("ora").equals("")) {
			System.out.println();
			
			String oraString = request.getParameter("ora");
			String oreMin[] = oraString.split(":");
			LocalTime ora= LocalTime.of(Integer.parseInt(oreMin[0]), Integer.parseInt(oreMin[1]));
			agenda.addAppuntamento(descrizione,ora);
		}else {
			agenda.addAppuntamento(descrizione);
		}
		doGet(request, response);
		
	}

}
