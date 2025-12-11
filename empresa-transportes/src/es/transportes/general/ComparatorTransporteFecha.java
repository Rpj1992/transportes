package es.transportes.general;

import java.util.Comparator;

public class ComparatorTransporteFecha implements Comparator<Transporte>{

	@Override
	public int compare(Transporte o1, Transporte o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getFecha().getYear(), o2.getFecha().getYear());
	}
	
	

}
