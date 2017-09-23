/**
 * 
 * @author Felipe Andrade
 *
 */

public class Cinema extends Ambiente 
{
	// Atributos Cinema
	
	private int sala;
	private int cadeira;
	
	//Encapsulando
	
	public Cinema(String localizacao, String referencia, int vagas,int capacidade) 
	{
		super(localizacao, referencia, vagas, capacidade);
		this.setSala(sala);
		this.setCadeira(cadeira);			
	}
	
	//Getters & Setters
	
	public int getSala() 
	{
		return sala;
	}
	
	public void setSala(int sala) 
	{
		this.sala = sala;
	}
	
	public int getCadeira() 
	{
		return cadeira;
	}
	
	public void setCadeira(int cadeira) 
	{
		this.cadeira = cadeira;
	}
	

}
