package fr.aston.poec.java.ws.soap.impl;

import javax.jws.WebService;

import fr.aston.poec.java.ws.soap.IConvertir;

@WebService(endpointInterface = "fr.aston.poec.java.ws.soap.IConvertir")

public class Convertir implements IConvertir {

	@Override
	public double celsiusFahrenheit(double celsius) {
		return celsius * 9 / 5 + 32;
	}

	@Override
	public double kilometreMiles(double kilometre) {
		return kilometre * 0.621371;
	}
	

}
