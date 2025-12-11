package es.transportes.general;

import java.util.Comparator;

public class ComparatorConductorEdad implements Comparator<Conductor>{

	@Override
	public int compare(Conductor o1, Conductor o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getEdad(), o2.getEdad());
	}
	
	

}
