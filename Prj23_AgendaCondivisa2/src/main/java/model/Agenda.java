package model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Appuntamento> appuntamenti = new ArrayList<>();
	
	public void addAppuntamento(String a) {
		appuntamenti.add(new Appuntamento(a));
	}
	
	public void addAppuntamento(String a, LocalTime ora) {
		appuntamenti.add(new Appuntamento(a,ora));
	}
	
	public Appuntamento getAppuntamento(int a) {
		return appuntamenti.get(a);
	}
	
	public ArrayList<Appuntamento> getAppuntamenti() {
		return appuntamenti;
	}
	
}
