package fr.aston.poec.java.ws.client;

import fr.aston.poec.java.ws.ConverterService;
import fr.aston.poec.java.ws.IConverter;

public class Client {

	public static void main(String[] args) {
		try {
			
			ConverterService service = new ConverterService();
			IConverter converter = service.getConverterPort();
			double res = converter.celsiusFahrenheit(12.12);
			System.out.println("la conversion = " + res);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
