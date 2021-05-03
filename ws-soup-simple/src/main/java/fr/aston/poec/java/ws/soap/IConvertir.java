package fr.aston.poec.java.ws.soap;

import javax.jws.WebService;

@WebService
public interface IConvertir {
	
	public double celsiusFahrenheit(double celseus);
	public double fahrenheitCelsius(double fahrenheit);

}
