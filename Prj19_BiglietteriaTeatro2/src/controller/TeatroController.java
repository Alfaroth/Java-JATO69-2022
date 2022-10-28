package controller;

import java.util.ArrayList;

import db.TeatroDAO;
import model.Teatro;

public class TeatroController {
	
	private TeatroDAO dao = new TeatroDAO();
	
	public ArrayList<Teatro> elencoTeatri() {
		return dao.getTeatri();
	}
	
	public void addTeatro(String nomeTeatro) {
		
		Teatro t = new Teatro(nomeTeatro, 0);
		dao.addTeatro(t);

	}

}
