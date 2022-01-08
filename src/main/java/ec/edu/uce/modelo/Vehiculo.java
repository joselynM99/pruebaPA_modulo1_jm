package ec.edu.uce.modelo;

import org.springframework.beans.factory.annotation.Autowired;

import ec.edu.uce.repository.IVehiculoRepo;

public class Vehiculo {
	
	private String marca;
	private String paisOrigen;
	private String placa;
	@Autowired
	private Propietario propietario;
	
	private double precio;
	private double valorMatricula;
	@Autowired
	private IVehiculoRepo vehRepo;
	
	
	//Metodos Set y Get
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	
	public IVehiculoRepo getVehRepo() {
		return vehRepo;
	}
	public void setVehRepo(IVehiculoRepo vehRepo) {
		this.vehRepo = vehRepo;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", paisOrigen=" + paisOrigen + ", placa=" + placa + ", propietario="
				+ propietario + ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}
	
	
	

}
