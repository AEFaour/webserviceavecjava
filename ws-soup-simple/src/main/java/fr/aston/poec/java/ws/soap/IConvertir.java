package fr.aston.poec.java.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IConvertir {
	
	@WebMethod
	double celsiusFahrenheit(double celsius);

	@WebMethod(exclude = true)
	double kilometreMiles(double kilometre);

}
