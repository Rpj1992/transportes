package es.transportes.general;

public class Furgoneta extends Vehiculo implements Comparable<Furgoneta>{
	
	private int numKm;
	private boolean cambioAutomatico;
	private int marchas;
	
	public Furgoneta() {
		super();
	}

	public Furgoneta(Integer idVehiculo, String marca, String modelo, int añoFabricacion, int numKm,
			boolean cambioAutomatico, int marchas) {
		super(idVehiculo, marca, modelo, añoFabricacion);
		this.numKm = numKm;
		this.cambioAutomatico = cambioAutomatico;
		this.marchas = marchas;
	}

	public int getNumKm() {
		return numKm;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setNumKm(int numKm) {
		this.numKm = numKm;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	
	public String tipoDeUso () {
		if (numKm < 50000) {
			return "Ligero uso";
		} else if (numKm >= 50000 && numKm <= 100000) {
			return "Uso medio";
		} else {
			return "Uso intensivo";
		}
	}
	
	public boolean necesitaRevision() {
		return numKm > 100000 || antiguedad() > 10;
	}

	@Override
	public Integer identificar() {
		// TODO Auto-generated method stub
		return getIdVehiculo();
	}

	@Override
	public String describir() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public int compareTo(Furgoneta o) {
		// TODO Auto-generated method stub
		return Integer.compare(numKm, o.getNumKm());
	}
	
	

}
