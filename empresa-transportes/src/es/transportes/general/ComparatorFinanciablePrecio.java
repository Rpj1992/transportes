package es.transportes.general;

import java.util.Comparator;

import jarfinanciable.Financiable;

public class ComparatorFinanciablePrecio implements Comparator<Financiable>{

	@Override
	public int compare(Financiable o1, Financiable o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getPrecio(), o2.getPrecio());
	}

}
