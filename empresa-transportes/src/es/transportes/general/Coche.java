package es.transportes.general;

public class Coche extends Vehiculo implements Comparable<Coche>{
	
	private int numPlazas;
	private int cilindrada;
	private int capacidadDeposito;
	
	public Coche() {
		super();
	}

	public Coche(Integer idVehiculo, String marca, String modelo, int añoFabricacion, int numPlazas, int cilindrada,
			int capacidadDeposito) {
		super(idVehiculo, marca, modelo, añoFabricacion);
		actualizarNumPlazas(numPlazas);
		this.cilindrada = cilindrada;
		this.capacidadDeposito = capacidadDeposito;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setNumPlazas(int numPlazas) {
		actualizarNumPlazas(numPlazas);
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	private void actualizarNumPlazas (int numPlazas) {
		if (numPlazas > 1 && numPlazas < 10) {
			this.numPlazas = numPlazas;
		} else {
			System.out.println("Las plazas no pueden ser inferior a 1 o mayo de 10");
			this.numPlazas = 2;
		}
	}

	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}
	
	public String autonomiaEstimada () {
		return "3litros/100km";
	}
	
	public String clasificacionPorPlazas () {
		if (numPlazas == 2) {
			return "Biplaza";
		} else if (numPlazas > 2 && numPlazas < 5) {
			return "Compacto";
		} else {
			return "Familiar";
		}
		
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
	public int compareTo(Coche o) {
		// TODO Auto-generated method stub
		return Integer.compare(cilindrada, o.getCilindrada());
	}

	@Override
	public String toString() {
		return "Coche [numPlazas=" + numPlazas + ", cilindrada=" + cilindrada + ", capacidadDeposito="
				+ capacidadDeposito + "]";
	}

	
	
	

}
