package ec.edu.uce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IVehiculoRepo;
import ec.edu.uce.repository.VehiculoLivianoRepoImpl;


@Service
public class GestorCuentaServiceImpl implements IVehiculoService{
	
	private static final Logger LOG = LoggerFactory.getLogger(GestorCuentaServiceImpl.class);

	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoRepo vehiculoLiv;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoRepo vehiculoPes;
	

	@Override
	public void matricular(Vehiculo vehiculo) {
		
		if(vehiculo.getVehRepo().equals(VehiculoLivianoRepoImpl.class)) {
			vehiculo.setValorMatricula(vehiculoLiv.calcularValorMatricula(vehiculo.getPrecio()));
			vehiculoLiv.guardar(vehiculo);
			
		}else {
			vehiculo.setValorMatricula(vehiculoPes.calcularValorMatricula(vehiculo.getPrecio()));
			vehiculoPes.guardar(vehiculo);
		}
		
		
		LOG.info(vehiculo.toString());
		
		
	}

}
