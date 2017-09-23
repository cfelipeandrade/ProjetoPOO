import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Filme extends Evento
{
	// Atributos Cliente
	
	private	String				titulo;
	private	String				direcao;
	private String				elenco;
	private String				sinopse;
	private String				genero;
	private int					classificacaoIdade;
	
	//Encapsulando
	
	public Filme(Data data, Hora horario, Ambiente local, String titulo, String direcao, String elenco, String sinopse, String genero, int idade)
	{
		super(data, horario, local);
		this.titulo 				=	titulo;
		this.direcao 				=	direcao;
		this.elenco 				=	elenco;
		this.sinopse 				=	sinopse;
		this.genero 				=	genero;
		this.classificacaoIdade 	=	idade;
	}

	//Getters & Setters
	
	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	public String getDirecao() 
	{
		return direcao;
	}

	public void setDirecao(String direcao) 
	{
		this.direcao = direcao;
	}

	public String getElenco() 
	{
		return elenco;
	}

	public void setElenco(String elenco) 
	{
		this.elenco = elenco;
	}

	public String getSinopse() 
	{
		return sinopse;
	}

	public void setSinopse(String sinopse) 
	{
		this.sinopse = sinopse;
	}

	public String getGenero() 
	{
		return genero;
	}

	public void setGenero(String genero) 
	{
		this.genero = genero;
	}

	public int getClassificacaoIdade() 
	{
		return classificacaoIdade;
	}

	public void setClassificacaoIdade(int classificacaoIdade) 
	{
		this.classificacaoIdade = classificacaoIdade;
	}
	
	
}
