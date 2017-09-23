/**
 * 
 * @author Felipe Andrade
 *
 */

public class Ingresso 
{
	// Atributos Ingresso

	private int 		id;
	private float 		preco;
	private boolean 	foiVendido;
	private boolean		usado;
	
	//Encapsulando
	
	public Ingresso(int id, float preco)
	{
		this.id				=	id;
		this.preco			=	preco;
		this.foiVendido 	=	false;
		this.usado			=	false;
	}
	
	
	//Getters & Setters

	public int getId() 
	{
		return id;
	}

	public float getPreco() 
	{
		return preco;
	}

	public void setPreco(float preco) 
	{
		this.preco = preco;
	}
	
	public boolean isVendido()
	{
		return foiVendido;
	}
	
	public void setVendido()
	{
		foiVendido = true;
	}
}
