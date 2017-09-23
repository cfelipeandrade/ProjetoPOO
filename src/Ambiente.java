/**
 * 
 * @author Felipe Andrade
 *
 */

public class Ambiente 
{
	// Atributos Ambiente
	
	protected	String				localizacao;
	protected 	String 				pontoDeReferencia;
	protected 	int					capacidadeTotal;
	protected 	int					vagasEstacionamento;
	
	
	//Encapsulando
	
	public Ambiente(String localizacao, String referencia, int vagas, int capacidade)
	{
		this.localizacao			=	localizacao;
		this.pontoDeReferencia 		=	referencia;
		this.vagasEstacionamento 	=	vagas;
		this.capacidadeTotal 		=	capacidade;
					
	}

	//Getters & Setters

	public String getLocalizacao() 
	{
		return localizacao;
	}

	public void setLocalizacao(String localizacao) 
	{
		this.localizacao = localizacao;
	}

	public String getPontosReferencia() 
	{
		return pontoDeReferencia;
	}

	public void setPontosReferencia(String pontosReferencia) 
	{
		this.pontoDeReferencia = pontosReferencia;
	}

	public int getVagasEstacionamento() 
	{
		return vagasEstacionamento;
	}

	public void setVagasEstacionamento(int vagasEstacionamento) 
	{
		this.vagasEstacionamento = vagasEstacionamento;
	}
	
	public int getCapacidadeTotal() 
	{
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidade) 
	{
		this.capacidadeTotal = capacidade;
	}
	
}
