package presentation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;

import java.io.IOException;

import org.json.JSONArray;

import controller.ArticoloCtrl;


@WebServlet("/articoli")
public class ArticoloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ArticoloCtrl ctrl;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticoloServlet() {
        super();
        this.ctrl = new ArticoloCtrl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("main/header.jsp").include(request, response);
		request.getRequestDispatcher("main/menu.jsp").include(request, response);
//		String titolo = "Articoli";
//		request.setAttribute("titolo", titolo);
		request.getRequestDispatcher("articoli/titolo.jsp").include(request, response);
		//response.getWriter().append("<h1>Articoli</h1>");

		if(request.getParameter("id") != null) {	
			
			int id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("dettaglio", this.ctrl.getArticoloById(id));

			request.getRequestDispatcher("articoli/form_update.jsp").include(request, response);
			request.getRequestDispatcher("articoli/detail.jsp").include(request, response);
			
			
		} else {
			
			
			request.getRequestDispatcher("articoli/form_add.jsp").include(request, response);
			
			request.setAttribute("elenco", this.ctrl.getArticoli());
			request.getRequestDispatcher("articoli/list.jsp").include(request, response);
		}
		
		
		request.getRequestDispatcher("main/footer.jsp").include(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String descrizione = request.getParameter("descrizione");
		String categoria = request.getParameter("categoria");
		double prezzo = Double.parseDouble(request.getParameter("prezzo"));
		int rimanenza = Integer.parseInt(request.getParameter("rimanenza"));
		
		Articolo a = new Articolo();
		a.setDescrizione(descrizione);
		a.setCategoria(categoria);
		a.setPrezzo(prezzo);
		a.setRimanenza(rimanenza);
		
		if(request.getParameter("id") != null) {
			a.setId(Integer.parseInt(request.getParameter("id")));
			this.ctrl.updateArticolo(a);
		} else {
			
			this.ctrl.addArticolo(a);
		}
		
		
		doGet(request, response);
	}

}
