/**
 * 
 * @author Felipe Andrade
 *
 */

public class Data 
{
	// Atributos Data
	
	private 	int 		dia;
	private 	String 		mes;
	private 	int 		ano;
	
	
	//Encapsulando
	
	public Data(int dia, String mes, int ano) 
	{
	
		this.dia 	= 	dia;
		this.mes 	= 	mes;
		this.ano 	= 	ano;
	}
	
	//Encapsulando
	
	public int getDia() 
	{
		return dia;
	}
	
	public String getMes() 
	{
		return mes;
	}
	
	public int getAno() 
	{
		return ano;
	}
	
	@Override
	public String toString() 
	{
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	
	
}
