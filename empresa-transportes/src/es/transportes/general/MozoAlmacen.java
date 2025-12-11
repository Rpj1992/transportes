package es.transportes.general;

import java.time.LocalDate;

public class MozoAlmacen extends Empleado{
	
	private boolean cursoPRL;

	public MozoAlmacen() {
		super();
		cursoPRL = false;
	}

	public MozoAlmacen(boolean cursoPRL, String nombre, int edad, LocalDate fechaNacimiento) {
		super(nombre, edad, fechaNacimiento);
		this.cursoPRL = cursoPRL;
	}

	public boolean isCursoPRL() {
		return cursoPRL;
	}

	public void setCursoPRL(boolean cursoPRL) {
		this.cursoPRL = cursoPRL;
	}
	
	public String estadoPRL() {
		if (cursoPRL) {
			return "Con PRL";
		} else {
			return "Sin PRL";
		}
	}
	
	public boolean puedeTrabajar() {
		if (getEdad() < 18) {
			return false;
		} else if (!cursoPRL) {
			return false;
		} else {
			return true;
		}
	}

}
