package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.service.IVehiculoService;

@SpringBootApplication
public class PruebaModulo1JMApplication  implements CommandLineRunner{
	
	private static final Logger LOG = LoggerFactory.getLogger(PruebaModulo1JMApplication.class);
	
	@Autowired
	private IVehiculoService gestor;

	public static void main(String[] args) {
		SpringApplication.run(PruebaModulo1JMApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Vehiculo v = new Vehiculo();
		Propietario p = new Propietario();
		p.setApellido("Moncayo");
		p.setCedula("46645");
		p.setNombre("Joselyn");
		
		v.setMarca("Toyota");
		v.setPaisOrigen("España");
		v.setPlaca("KHBj");
		v.setPropietario(p);
		v.setPrecio(10000);
		this.gestor.matricular(v);
		
		
		
		
	}

}
