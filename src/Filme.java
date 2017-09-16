import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Filme 
{

	private	String				titulo;
	private	String				direcao;
	private ArrayList<String>	elenco;
	private String				sinopse;
	private String				genero;
	private int					classificacaoIdade;
	
	private Filme(String titulo, String direcao, ArrayList<String> elenco, String sinopse, String genero, int idade)
	{
		this.titulo 				=	titulo;
		this.direcao 				=	direcao;
		this.elenco 				=	elenco;
		this.sinopse 				=	sinopse;
		this.genero 				=	genero;
		this.classificacaoIdade 	=	idade;
	}
}
