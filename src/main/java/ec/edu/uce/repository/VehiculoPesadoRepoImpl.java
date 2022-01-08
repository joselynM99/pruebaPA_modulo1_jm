package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;

@Repository
@Qualifier("pesado")
public class VehiculoPesadoRepoImpl implements IVehiculoRepo {
	private double pesoTonealdas;
	
	private static final Logger LOG = LoggerFactory.getLogger(VehiculoPesadoRepoImpl.class);

	@Override
	public double calcularValorMatricula(double precio) {
		// TODO Auto-generated method stub
		return precio * 0.25;
	}
	
	@Override
	public void guardar(Vehiculo vehiculo) {
		
		LOG.info("Vehiculo Pesado guardado");
	}


	
	//Metodo get y Set
	public double getPesoTonealdas() {
		return pesoTonealdas;
	}

	public void setPesoTonealdas(double pesoTonealdas) {
		this.pesoTonealdas = pesoTonealdas;
	}


	
	
	
}
