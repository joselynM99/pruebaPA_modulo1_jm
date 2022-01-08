package ec.edu.uce.repository;

import ec.edu.uce.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	double calcularValorMatricula(double precio);
	void guardar(Vehiculo vehiculo);

}
