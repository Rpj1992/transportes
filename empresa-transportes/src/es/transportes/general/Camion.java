package es.transportes.general;

public class Camion extends Vehiculo implements Comparable<Vehiculo>{
	
	private int cargaMaxima;
	private int numEjes;
	
	public Camion() {
		super();
	}

	public Camion(Integer idVehiculo, String marca, String modelo, int añoFabricacion, int cargaMaxima, int numEjes) {
		super(idVehiculo, marca, modelo, añoFabricacion);
		this.cargaMaxima = cargaMaxima;
		this.numEjes = numEjes;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}
	
	public boolean esAptoParaCarretera() {
		return numEjes >= 2 && cargaMaxima > 200;
	}
	
	public int capacidadRestante (int cargaIntroducida) {
		return cargaMaxima - cargaIntroducida;
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
	public int compareTo(Vehiculo o) {
		if (o.getClass() == Camion.class) {
			Camion c = (Camion) o;
			return Integer.compare(getCargaMaxima(), c.getCargaMaxima() );
		}
//		return super.compareTo(); Haría falta que la clase Vehiculo tuviese un comparable.
		return 0;
	}

	@Override
	public String toString() {
		return "Camion [getIdVehiculo()=" + getIdVehiculo() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getAñoFabricacion()=" + getAñoFabricacion() + ", cargaMaxima=" + cargaMaxima
				+ ", numEjes=" + numEjes + "]";
	}


}
