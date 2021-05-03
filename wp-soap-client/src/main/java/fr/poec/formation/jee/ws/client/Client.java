package fr.poec.formation.jee.ws.client;

import fr.poec.formation.jee.ws.CalculatriceService;
import fr.poec.formation.jee.ws.ICalculatrice;

public class Client {
	public static void main(String[] args) {
		
		try {
			CalculatriceService service = new CalculatriceService();
			ICalculatrice calculatrice = service.getCalculatricePort();
			double resultat = calculatrice.addition(5.3, 7.2);
			System.out.println("resultat = " + resultat);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
