package es.transportes.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import es.transportes.general.Conductor;

public class Main {

	public static void main(String[] args) {
		Conductor c1 = new Conductor(new ArrayList<String>(Arrays.asList(Conductor.getTiposCarnets().get(4), Conductor.getTiposCarnets().get(6))), "Pepe", 33, LocalDate.of(1992, 10, 14));
		
		System.out.println(c1.listarCarnets());
		System.out.println(c1.toString());
		Conductor c2 = new Conductor();
		System.out.println(c2.listarCarnets());
		System.out.println(c2.toString());
	}

}
