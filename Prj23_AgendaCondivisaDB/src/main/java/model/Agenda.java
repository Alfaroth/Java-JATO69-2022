package model;

import java.time.LocalTime;
import java.util.ArrayList;

import dal.AppuntamentiDAO;
import dal.AppuntamentiDAOImpl;

public class Agenda {
	
	// private ArrayList<Appuntamento> appuntamenti = new ArrayList<>();
	private AppuntamentiDAO dao = new AppuntamentiDAOImpl();

	public void addAppuntamento(String a) {
		// appuntamenti.add(new Appuntamento(a));
		dao.addAppuntamento(new Appuntamento(a));
	}
	
	public void addAppuntamento(String a, LocalTime ora) {
		// appuntamenti.add(new Appuntamento(a,ora));
		dao.addAppuntamento(new Appuntamento(a, ora));
	}
	
	public void cancellaAppuntamento(int id) {
		dao.deleteAppuntamentoById(id);
	}
	
	public Appuntamento getAppuntamento(int a) {
		// return appuntamenti.get(a);
		return dao.getAppuntamentoById(a);
	}
	
	public ArrayList<Appuntamento> getAppuntamenti() {
		// return appuntamenti;
		return (ArrayList<Appuntamento>)dao.getAppuntamenti();
	}
	
}
