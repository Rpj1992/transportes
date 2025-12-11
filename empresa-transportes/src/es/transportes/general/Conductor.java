package es.transportes.general;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conductor extends Empleado {

	private List<String> carnets;
	private static final List<String> TIPOS_CARNETS = new ArrayList<String>(Arrays.asList("AM","A1","A2","A","B","B+E","C","C+E","D","D+E"));
	private static final List<String> CARNET_DEFECTO= new ArrayList<String>(Arrays.asList("B"));
	
	public Conductor() {
		super();
		this.carnets = CARNET_DEFECTO;
	}

	public Conductor(List<String> carnets, String nombre, int edad, LocalDate fechaNacimiento) {
		super(nombre, edad, fechaNacimiento);
		actualizarCarnet(carnets);
	}

	public List<String> getCarnets() {
		return carnets;
	}

	public static List<String> getTiposCarnets() {
		return TIPOS_CARNETS;
	}

	public static List<String> getCarnetDefecto() {
		return CARNET_DEFECTO;
	}

	public void setCarnets(List<String> carnets) {
		actualizarCarnet(carnets);
	}
	
	private void actualizarCarnet(List<String> carnets) {
		if (carnets != null) {
			this.carnets = carnets;
		} else {
			System.out.println("Hay que introducir carnets");
		}
	}
	
	public boolean tieneCarnet(String c) {
		boolean esta = false;
		for (String carnet : carnets) {
			if (c.toUpperCase().equals(carnet)) {
				esta = true;
				break;
			}
		}
		return esta;
	}
	
	public String listarCarnets() {
		String descripcion = "";
		if (!carnets.isEmpty()) {
			
			for (int i = 0; i < carnets.size(); i++) {
				descripcion += carnets.get(i);
				if (i < carnets.size() -1) {
					descripcion += "-";
				}
			}
			
		}
		return descripcion;
	}
	
}
