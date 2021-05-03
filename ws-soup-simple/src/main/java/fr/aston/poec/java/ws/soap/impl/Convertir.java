package fr.aston.poec.java.ws.soap.impl;

import javax.jws.WebService;

import fr.aston.poec.java.ws.soap.IConvertir;

@WebService(endpointInterface = "fr.aston.poec.java.ws.soap.IConvertir")

public class Convertir implements IConvertir {

	@Override
	public double celsiusFahrenheit(double celsius) {
		// TODO Auto-generated method stub
		return (celsius * 9/5) + 32 ;
	}

	@Override
	public double fahrenheitCelsius(double fahrenheit) {
		// TODO Auto-generated method stub
		return (fahrenheit - 32) * 0.5556;
	}

}
