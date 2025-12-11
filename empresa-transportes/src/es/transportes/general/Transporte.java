package es.transportes.general;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jarfinanciable.Financiable;

public class Transporte implements Identificable<Integer>, Descriptible, Comparable<Transporte>, Financiable{
	
	private int idTransporte;
	private List<MozoAlmacen> mozos;
	private Conductor conductor;
	private Vehiculo vehiculo;
	private String destino;
	private LocalDate fecha;
	private int precio;
	
	public Transporte() {
		
	}

	public Transporte(int idTransporte, List<MozoAlmacen> mozos, Conductor conductor, Vehiculo vehiculo, String destino,
			LocalDate fecha, int precio) {
		this.idTransporte = idTransporte;
		this.mozos = mozos;
		this.conductor = conductor;
		this.vehiculo = vehiculo;
		actualizarDestino(destino);
		this.fecha = fecha;
		this.precio = precio;
	}

	public int getIdTransporte() {
		return idTransporte;
	}

	public List<MozoAlmacen> getMozos() {
		return mozos;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public String getDestino() {
		return destino;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getPrecio() {
		return precio;
	}

	public void setIdTransporte(int idTransporte) {
		this.idTransporte = idTransporte;
	}

	public void setMozos(List<MozoAlmacen> mozos) {
		this.mozos = mozos;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public void setDestino(String destino) {
		actualizarDestino(destino);
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	private void actualizarDestino (String destino) {
		if (destino.equalsIgnoreCase("Valladolid") || destino.equalsIgnoreCase("Murcia") || destino.equalsIgnoreCase("Zaragoza")
				|| destino.equalsIgnoreCase("Valencia") || destino.equalsIgnoreCase("Albacete")) {
			this.destino = destino;
		} else {
			System.out.println("El destino no puede ser distinto a los que trabaja esta empresa");
		}
	}

	@Override
	public String describir() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		return "Transporte [idTransporte=" + idTransporte + ", mozos=" + mozos + ", conductor=" + conductor
				+ ", vehiculo=" + vehiculo + ", destino=" + destino + ", fecha=" + fecha + ", precio=" + precio + "]";
	}
	
	public String cadenaMozos () {
		String descripcion = "";
		if (!mozos.isEmpty()) {
			
			for (int i = 0; i < mozos.size(); i++) {
				descripcion += mozos.get(i).getNombre();
				if (i < mozos.size() -1) {
					descripcion += "-";
				}
			}
			
		}
		return descripcion;
	}
	
	public void eliminarMozos() {
		Iterator<MozoAlmacen> iterador = mozos.iterator();
		while (iterador.hasNext()) {
			MozoAlmacen mozoAlmacen = (MozoAlmacen) iterador.next();
			if (mozoAlmacen.getEdad() < 18 || !mozoAlmacen.isCursoPRL()) {
				iterador.remove();
			}
		}
	}
	
	public List<MozoAlmacen> mozosMayoresEdad () {
		List<MozoAlmacen> mozosMayores = new ArrayList<MozoAlmacen>();
		
		Iterator<MozoAlmacen> iterador = mozos.iterator();
		while (iterador.hasNext()) {
			MozoAlmacen mozo = (MozoAlmacen) iterador.next();
			if (mozo.getEdad() > 18) {
				mozosMayores.add(mozo);
			}
		}
		return mozosMayores;
	}

	@Override
	public boolean esFinanciable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int compareTo(Transporte o) {
		// TODO Auto-generated method stub
		return Integer.compare(precio, o.getPrecio());
	}

	@Override
	public Integer identificar() {
		// TODO Auto-generated method stub
		return getIdTransporte();
	}
	
	
 	
}
