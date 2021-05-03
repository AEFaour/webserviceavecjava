package fr.aston.poec.java.ws.client;

import fr.aston.poec.java.ws.ConverterService;
import fr.aston.poec.java.ws.IConverter;
import fr.aston.poec.java.ws.simple.ConvertirService;
import fr.aston.poec.java.ws.simple.IConvertir;

public class Client {

	public static void main(String[] args) {
		try {
			
			ConverterService service = new ConverterService();
			IConverter converter = service.getConverterPort();
			double res = converter.celsiusFahrenheit(12.12);
			System.out.println("La conversion serveur externe ws = " + res);
		
			ConvertirService convertirService = new ConvertirService();
			IConvertir convertir = convertirService.getConvertirPort();
			System.out.println("La conversion serveur local ws = " + convertir.celsiusFahrenheit(12.12));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
