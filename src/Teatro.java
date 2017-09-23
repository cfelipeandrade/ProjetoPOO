/**
 * 
 * @author Felipe Andrade
 *
 */

public class Teatro extends Ambiente 
{
	// Atributos Teatro
	
	private 	int 	assento;
	private 	char 	setor;
	
	//Encapsulando
	
	public Teatro(String localizacao, String referencia, int vagas,int capacidade, int assento, char setor) 
	{
		super(localizacao, referencia, vagas, capacidade);
		this.setSetor(setor);
		this.setAssento(assento);
		
	}
	
	//Getters & Setters
	
	public int getAssento() 
	{
		return assento;
	}
	
	public void setAssento(int assento) 
	{
		this.assento = assento;
	}
	
	public char getSetor() 
	{
		return setor;
	}
	
	public void setSetor(char setor) 
	{
		this.setor = setor;
	}
	

}
