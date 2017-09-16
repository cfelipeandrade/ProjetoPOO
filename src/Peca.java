import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Peca 
{

	private 	String				titulo;
	private		String				sinopse;
	private 	ArrayList<String>	elenco;
	private 	String				diretor;
	private		ArrayList<String>	equipeTecnica;
	
	public Peca (String titulo, String sinopse, String[] elenco, String diretor, String[] equipe)
	{
		this.titulo 		=	titulo;
		this.sinopse 		=	sinopse;
		this.elenco			=	new ArrayList<>();
		this.diretor 		=	diretor;
		this.equipeTecnica 	=	new ArrayList<>();
	}
}
