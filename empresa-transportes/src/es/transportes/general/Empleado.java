package es.transportes.general;

import java.time.LocalDate;

public abstract class Empleado {
	
	private String nombre;
	private int edad;
	private LocalDate fechaNacimiento;
	
	public Empleado() {
		nombre = "Paco";
		edad = 18;
		fechaNacimiento = LocalDate.of(1992, 01, 01);
	}

	public Empleado(String nombre, int edad, LocalDate fechaNacimiento) {
		actualizarNombre(nombre);
		actualizarFechaNacimiento(fechaNacimiento);
		actualizarEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setNombre(String nombre) {
		actualizarNombre(nombre);
	}

	public void setEdad(int edad) {
		actualizarEdad(edad);
		
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		actualizarFechaNacimiento(fechaNacimiento);
	}
	
	private void actualizarFechaNacimiento (LocalDate fechaNacimiento) {
		if (fechaNacimiento.getYear() < LocalDate.now().getYear()) {
			this.fechaNacimiento = fechaNacimiento;
		} else {
			System.out.println("El año de la fecha de nacimiento no puede ser igual o superior al actual.");
		}
	}
	
	private void actualizarEdad(int edad) {
		if (LocalDate.now().getYear() - fechaNacimiento.getYear() == edad) {
			this.edad = edad;
		} else {
			System.out.println("La edad no puede ser distanta a la resta del año actual al año de nacimiento");
		}
	}
	
	private void actualizarNombre (String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		} else {
			System.out.println("Hay que introducir un nombre");
		}
	}
	
	public String datosEmpleado() {
		String esMayor = "menor";
		
		if (LocalDate.now().getYear() - fechaNacimiento.getYear() >= 18) {
			esMayor = "mayor";
		}
		
		return "Nombre: " + getNombre() + " de " + getEdad() +" y es " + esMayor + " de edad.";
	}

	@Override
	public String toString() {
		return "Empleado "+ datosEmpleado() +" Fecha de nacimiento: "+ fechaNacimiento;
	}
	
	
	
}
