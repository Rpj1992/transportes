package es.transportes.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.transportes.general.*;
import jarfinanciable.*;

public class Main {
	
	public static void inicializarEjercicio(String letra,int numero) {
		System.out.println("\n========================");
		System.out.println("Ejercicio nº "+letra+numero);
		System.out.println("========================\n");
	}

	public static void main(String[] args) {

		Conductor carlos = new Conductor( new ArrayList<>(Conductor.getTiposCarnets().subList(4, 6)),"Carlos", 34, LocalDate.of(1991, 4, 10));
		Conductor roberto = new Conductor(new ArrayList<>(Conductor.getTiposCarnets().subList(4, 5)),"Roberto", 51, LocalDate.of(1974, 3, 3));
		
		MozoAlmacen isabel = new MozoAlmacen(true, "Isabel", 23, LocalDate.of(2002, 6, 22));
		MozoAlmacen lucia = new MozoAlmacen(false, "Lucia", 17, LocalDate.of(2007, 12, 12));
		MozoAlmacen robertoMozo = new MozoAlmacen(true, "Roberto", 51, LocalDate.of(1974, 3, 3));
		MozoAlmacen martin = new MozoAlmacen(true, "Martin", 56, LocalDate.of(1969, 8, 20));
		
		List<MozoAlmacen> mozos1 = new ArrayList<>(Arrays.asList(lucia, isabel, robertoMozo, martin)); 
		List<MozoAlmacen> mozos2 = new ArrayList<>(Arrays.asList(isabel, robertoMozo)); 
		
		Coche coche1 = new Coche(1, "Mazda", "3", 2010, 5, 1600, 55); 
		Coche coche2 = new Coche(2, "Fiat", "500", 2004, 2, 1200, 40); 
		Coche coche3 = new Coche(3, "Honda", "Civic", 2022, 5, 2000, 60); 
		Coche coche4 = new Coche(4, "Kia", "Rio", 2016, 4, 1400, 45); 
		
		Furgoneta furgoneta1 = new Furgoneta(5, "Opel", "Vivaro", 2015, 45000, false, 6); 
		Furgoneta furgoneta2 = new Furgoneta(6, "VW", "Caddy", 2020, 80000, true, 5); 
		Furgoneta furgoneta3 = new Furgoneta(7, "Ford", "Transit", 2008, 150000, false, 5); 
		Furgoneta furgoneta4 = new Furgoneta(8, "Nissan", "NV300", 2012, 90000, false, 6); 
		
		Camion camion1 = new Camion(9, "Renault", "Premium", 1999, 190000, 3); 
		Camion camion2 = new Camion(10, "DAF", "XF480", 2013, 240000, 4); 
		Camion camion3 = new Camion(11, "Iveco", "Eurocargo", 2018, 180000, 2); 
		Camion camion4 = new Camion(12, "Scania", "R440", 2006, 160000, 2); 
		
		Transporte transporte1 = new Transporte(1, new ArrayList<>(mozos1), carlos, coche1, "Valencia", 
				LocalDate.of(2025, 12, 11), 520); 
		Transporte transporte2 = new Transporte(2, new ArrayList<>(mozos2), roberto, furgoneta1, "Murcia",
				LocalDate.of(2025, 12, 14), 360); 
		Transporte transporte3 = new Transporte(3, new ArrayList<>(mozos2), carlos, camion1, "Zaragoza",
				LocalDate.of(2025, 12, 18), 820); 
		Transporte transporte4 = new Transporte(4, new ArrayList<>(mozos1), roberto, coche2, "Valladolid",
				LocalDate.of(2025, 12, 20), 460); 
		
		Inmueble inmueble1 = new Inmueble("Chalet Sur", 175000); 
		Inmueble inmueble2 = new Inmueble("Piso Este", 130000); 
		Inmueble inmueble3 = new Inmueble("Nave Almacén", 220000); 
		
		List<Empleado> empleados = new ArrayList<>(Arrays.asList(carlos, isabel, lucia, roberto)); 
		List<Coche> coches = new ArrayList<>(Arrays.asList(coche1, coche2, coche3, coche4)); 
		List<Furgoneta> furgonetas = new ArrayList<>(Arrays.asList(furgoneta1, furgoneta2, furgoneta3, furgoneta4)); 
		List<Camion> camiones = new ArrayList<>(Arrays.asList(camion1, camion2, camion3, camion4)); 
		List<Transporte> transportes = new ArrayList<>(Arrays.asList(transporte1, transporte2, transporte3, transporte4)); 
		List<Financiable> financiables = new ArrayList<>( 
				Arrays.asList(transporte1, transporte2, inmueble1, inmueble2, inmueble3, transporte3));
		
		inicializarEjercicio("B",1);
		
		System.out.println(carlos);
		System.out.println(isabel);
		System.out.println(coche1);
		System.out.println(furgoneta1);
		System.out.println(camion1);
		System.out.println(transporte1);
		System.out.println(inmueble1);
		
		inicializarEjercicio("B", 2);
		transporte1.setDestino("Malaga");
		
		inicializarEjercicio("B", 3);
		System.out.println("El precio base es: "+transporte1.getPrecioBase());
		System.out.println("Los km del vehículo son: "+"es un coche no tiene num km."/*transporte1.getVehiculo().getNumKm()*/);
		System.out.println("El precio final es: "+transporte1.getPrecio());
		
		inicializarEjercicio("B", 4);
		System.out.println(transporte1.cadenaMozos());
		
		inicializarEjercicio("B", 5);
		System.out.println("Hay inicialmente "+transporte1.getMozos().size()+" mozos");
		transporte1.eliminarMozos();
		System.out.println("Despues de elminar mozos hay: "+transporte1.getMozos().size()+" mozos");
		
		inicializarEjercicio("B", 6);
		List<MozoAlmacen> nuevaListaMozos = transporte1.mozosMayoresEdad();
		for (MozoAlmacen mozoAlmacen : nuevaListaMozos) {
			System.out.println(mozoAlmacen);
		}
		
		inicializarEjercicio("B", 7);
		for (int i = 0; i < transporte1.getMozos().size(); i++) {
			if (	transporte1.getMozos().get(i).isCursoPRL() &&
					transporte1.getMozos().get(i).getNombre().startsWith("A") ||
					transporte1.getMozos().get(i).getNombre().startsWith("E") ||
					transporte1.getMozos().get(i).getNombre().startsWith("I") ||
					transporte1.getMozos().get(i).getNombre().startsWith("O") ||
					transporte1.getMozos().get(i).getNombre().startsWith("U")	) {
				
				System.out.println(transporte1.getMozos().get(i).getNombre());
			}
		}
		
		inicializarEjercicio("B", 8);
		System.out.println("Antigüedad de coche 1: "+coche1.antiguedad());
		System.out.println("esVeterano de coche 1: "+coche1.esVeterano());
		System.out.println("Antigüedad de camion 1: "+camion1.antiguedad());
		System.out.println("esVeterano de camion 1: "+camion1.esVeterano());
		
		
		
	}

}
