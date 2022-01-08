package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;

@Repository
@Qualifier("liviano")
public class VehiculoLivianoRepoImpl implements IVehiculoRepo {
	
	private double cilindrajeTurbo;
	
	private static final Logger LOG = LoggerFactory.getLogger(VehiculoLivianoRepoImpl.class);

	@Override
	public double calcularValorMatricula(double precio) {

		return precio * 0.10;
	}
	
	@Override
	public void guardar(Vehiculo vehiculo) {
		
		LOG.info("Vehiculo Liviano guardado");
	}

	
	//Metodo get y set

	public double getCilindrajeTurbo() {
		return cilindrajeTurbo;
	}

	public void setCilindrajeTurbo(double cilindrajeTurbo) {
		this.cilindrajeTurbo = cilindrajeTurbo;
	}
	
	

}
