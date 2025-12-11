package es.transportes.general;

import java.util.Comparator;

public class ComparatorCamionEjes implements Comparator<Camion>{

	@Override
	public int compare(Camion o1, Camion o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getNumEjes(), o2.getNumEjes());
	}
	
	

}
