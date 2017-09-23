/**
 * 
 * @author Felipe Andrade
 *
 */

public class Hora {
	
	// Atributos Cliente
	
	private int horas;
	private int minutos;
	
	//Encapsulando
	
	public Hora(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}
	
	//Getters & Setters
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Hora [horas=" + horas + ", minutos=" + minutos + "]";
	}
	
	
}
