package fr.poec.formation.jee.ws.impl;

import javax.jws.WebService;

import fr.poec.formation.jee.ws.ICalculatrice;

@WebService(endpointInterface = "fr.poec.formation.jee.ws.ICalculatrice")
public class Calculatrice implements ICalculatrice{

	@Override
	public double addition(double x, double y) {
		
		return x + y;
	}

	@Override
	public double soutraction(double x, double y) {
		
		return x - y;
	}

	@Override
	public double division(double x, double y) {
		
		return x * y;
	}

	@Override
	public double multiplication(double x, double y) {
		
		return x / y;
	}

	@Override
	public int modulo(int x, int y) {
		
		return x % y;
	}

}
