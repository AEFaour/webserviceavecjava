package fr.poec.formation.jee.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalculatrice {
	@WebMethod
	double addition(double x, double y);

	@WebMethod
	double soutraction(double x, double y);

	@WebMethod
	double division(double x, double y);

	@WebMethod
	double multiplication(double x, double y);

	@WebMethod
	int modulo(int x, int y);
}
