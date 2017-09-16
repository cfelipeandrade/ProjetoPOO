/**
 * 
 * @author Felipe Andrade
 *
 */

public class Ingresso {

	private int 	id;
	private float 	preco;
	private char	setor;
	private int		cadeira;
	
	//Encapsulando
	
	private Ingresso(int id, float preco, char setor, int cadeira)
	{
		this.id			=	id;
		this.preco		=	preco;
		this.setor 		=	setor;
		this.cadeira	=	cadeira;
	}
	
	//Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public char getSetor() {
		return setor;
	}

	public void setSetor(char setor) {
		this.setor = setor;
	}

	public int getCadeira() {
		return cadeira;
	}

	public void setCadeira(int cadeira) {
		this.cadeira = cadeira;
	}
	
	
}
