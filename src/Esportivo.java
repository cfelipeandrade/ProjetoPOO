/**
 * 
 * @author Felipe Andrade
 *
 */

public class Esportivo extends Evento
{
	// Atributos Esportivo
	
	private 	String		tipo;
	private 	String 		time;
	private 	String 		campeonato;
	private		String 		treinador;
	
	//Encapsulando
	
	public Esportivo(Data data, Hora horario,Ambiente local,String tipo, String time, String campeonato, String treinador ) 
	{
		super(data, horario, local);
		this.setTipo(tipo);
		this.setTime(time);
		this.setCampeonato(campeonato);
		this.setTreinador(treinador);
	}
	
	//Getters & Setters
	
	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public String getCampeonato() 
	{
		return campeonato;
	}

	public void setCampeonato(String campeonato) 
	{
		this.campeonato = campeonato;
	}

	public String getTreinador() 
	{
		return treinador;
	}

	public void setTreinador(String treinador) 
	{
		this.treinador = treinador;
	}

	public String getTime() 
	{
		return time;
	}

	public void setTime(String time) 
	{
		this.time = time;
	}
}
