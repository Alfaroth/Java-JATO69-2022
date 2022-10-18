package test;

import java.time.LocalDateTime;

import controller.GestioneAppuntamenti;
import model.Appuntamento;
import model.Paziente;
import model.Stanza;

public class TestGestioneAppuntamenti {

	public static void main(String[] args) {
		
		Paziente p1 = new Paziente("Giovanni", "Verga", "GVNVRG123");
		Paziente p2 = new Paziente("Marie", "Curie", "MARCUR234");
		Paziente p3 = new Paziente("Leonardo", "da Vinci", "LNDDVN345");
		Paziente p4 = new Paziente("Giuseppe", "Garibaldi", "GSPGRB456");
		
		Paziente[] pazienti = {p1, p2, p3, p4};
		
		Stanza s1 = new Stanza("A23");
		Stanza s2 = new Stanza("A24");
		Stanza s3 = new Stanza("A25");
		
		Appuntamento a1 = new Appuntamento(p1, s1, LocalDateTime.of(2022,10,19, 10,00), "Otturazione");
		Appuntamento a2 = new Appuntamento(p2, s2, LocalDateTime.of(2022,10,19, 10,00), "Pulizia dentale");
		Appuntamento a3 = new Appuntamento(p3, s3, LocalDateTime.of(2022,10,19, 10,00), "Estrazione");
		Appuntamento a4 = new Appuntamento(p4, s2, LocalDateTime.of(2022,10,19, 11,00), "Estrazione");
		Appuntamento a5 = new Appuntamento(p1, s3, LocalDateTime.of(2022,10,19, 11,00), "Pulizia dentale");
		Appuntamento a6 = new Appuntamento(p1, s3, LocalDateTime.of(2022,10,19, 12,00), "Pagamento");
		
		
		GestioneAppuntamenti gestione = new GestioneAppuntamenti();
		
		gestione.addAppuntamento(a1);
		gestione.addAppuntamento(a2);
		gestione.addAppuntamento(a3);
		gestione.addAppuntamento(a4);
		gestione.addAppuntamento(a5);
		gestione.addAppuntamento(a6);
		
		listaCompleta(gestione);
		
		appuntamentiPerPaziente(p1, gestione);
		
		appuntamentiPerStanza(s1, gestione);
		
		trovaPazienteByCF(pazienti);
		
	}

	private static void trovaPazienteByCF(Paziente[] pazienti) {
		String codFiscale = "MARCUR234";
		
		for (Paziente paziente : pazienti) {
			if (paziente.getCodFiscale().equals(codFiscale)) {
				System.out.println("Paziente ricercato:");
				System.out.println(paziente);
			}
		}
	}

	private static void appuntamentiPerStanza(Stanza s1, GestioneAppuntamenti gestione) {
		System.out.println("Appuntamenti nella stanza " + s1 + "\n");
		
		for (Appuntamento a : gestione.getAppuntamentiByStanza(s1)) {
			System.out.println(a);
		}
	}

	private static void appuntamentiPerPaziente(Paziente p1, GestioneAppuntamenti gestione) {
		System.out.println("Appuntamenti del paziente " + p1 + "\n");
		
		for (Appuntamento a : gestione.getAppuntamentiByPaziente(p1)) {
			System.out.println(a);
		}
	}

	private static void listaCompleta(GestioneAppuntamenti gestione) {
		for (Appuntamento a : gestione.getLista()) {
			System.out.println(a);
		}
	}
	
}