package view;

import java.util.ArrayList;

import controller.TeatroController;
import model.Teatro;

public class TeatroView {

	public static void main(String[] args) {
		
		TeatroController ctrl = new TeatroController();
		ctrl.addTeatro("Intervallo");
		ArrayList<Teatro> elencoTeatri = ctrl.elencoTeatri();
		
		elencoTeatri.get(3).getPosti().get(0).setDisponibile(false);
		elencoTeatri.get(3).getPosti().get(5).setDisponibile(false);
		elencoTeatri.get(3).getPosti().get(32).setDisponibile(false);
		elencoTeatri.get(3).getPosti().get(16).setDisponibile(false);
		elencoTeatri.get(3).getPosti().get(31).setDisponibile(false);
		elencoTeatri.get(3).getPosti().get(20).setDisponibile(false);
		
		for (Teatro teatro : elencoTeatri) {
			System.out.println(teatro);
		}
		
	}
	
}
