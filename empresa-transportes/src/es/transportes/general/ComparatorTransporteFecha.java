package es.transportes.general;

import java.util.Comparator;

public class ComparatorTransporteFecha implements Comparator<Transporte>{

	@Override
	public int compare(Transporte o1, Transporte o2) {

		if (Integer.compare(o1.getFecha().getYear(), o2.getFecha().getYear()) == 0) {
			if (Integer.compare(o1.getFecha().getMonthValue(), o2.getFecha().getMonthValue()) == 0) {
				return Integer.compare(o1.getFecha().getDayOfMonth(), o2.getFecha().getDayOfMonth());
			} else {
				return Integer.compare(o1.getFecha().getMonthValue(), o2.getFecha().getMonthValue());
			}
		} else {
			return Integer.compare(o1.getFecha().getYear(), o2.getFecha().getYear());
		}
		
	//	return o1.getFecha().compareTo(o2.getFecha());
	}
	
	

}
