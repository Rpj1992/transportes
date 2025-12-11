package es.transportes.general;

import java.util.Comparator;

public class ComparatorVehiculoMarca implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return o1.getMarca().compareTo(o2.getMarca());
	}

	
}
