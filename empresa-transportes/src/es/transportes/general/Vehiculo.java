package es.transportes.general;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Vehiculo implements Identificable<Integer>, Descriptible{
	
	private Integer idVehiculo;
	private String marca;
	private String modelo;
	private int anoFabricacion;
	
	public Vehiculo() {
		//Valores null
	}

	public Vehiculo(Integer idVehiculo, String marca, String modelo, int anoFabricacion) {
		this.idVehiculo = idVehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacion = anoFabricacion;
	}

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAñoFabricacion() {
		return anoFabricacion;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAñoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idVehiculo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(idVehiculo, other.idVehiculo);
	}
	
	public void arrancar() {
		System.out.println("Arrancando el "+getClass().getName().substring(23)+"...");
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Vehiculo arrancado");
	}
	
	public int antiguedad() {
		return LocalDate.now().getYear() - anoFabricacion;
	}
	
	public boolean esVeterano() {
		return antiguedad() > 20;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacion="
				+ anoFabricacion + "]";
	}
	

}
