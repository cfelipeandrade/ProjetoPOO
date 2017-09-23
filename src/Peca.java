import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Peca extends Evento
{
	// Atributos Peca
	
	private 	String				titulo;
	private		String				sinopse;
	private 	ArrayList<String>	elenco;
	private 	String				diretor;
	private		ArrayList<String>	equipeTecnica;
	
	//Encapsulando
	
	public Peca (Data data, Hora horario, Ambiente local, String titulo, String sinopse, String elenco, String diretor, String equipe)
	{
		super(data, horario, local);
		this.titulo 		=	titulo;
		this.sinopse 		=	sinopse;
		this.elenco			=	new ArrayList<>();
		this.diretor 		=	diretor;
		this.equipeTecnica 	=	new ArrayList<>();
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

	public String getSinopse() 
	{
		return sinopse;
	}

	public void setSinopse(String sinopse) 
	{
		this.sinopse = sinopse;
	}

	public ArrayList<String> getElenco() 
	{
		return elenco;
	}

	public void setElenco(ArrayList<String> elenco) 
	{
		this.elenco = elenco;
	}

	public String getDiretor() 
	{
		return diretor;
	}

	public void setDiretor(String diretor) 
	{
		this.diretor = diretor;
	}

	public ArrayList<String> getEquipeTecnica() 
	{
		return equipeTecnica;
	}

	public void setEquipeTecnica(ArrayList<String> equipeTecnica) 
	{
		this.equipeTecnica = equipeTecnica;
	}
	
}
