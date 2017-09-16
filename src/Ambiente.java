import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Ambiente 
{

	private	String				nome;
	private String				localizacao;
	private ArrayList<String>	pontosReferencia;
	private int					capacidadeTotal;
	private ArrayList<String>	setores;
	private int					vagasEstacionamento;
	private String				tipoAmbiente;
	
	
	public Ambiente(String nome, String localizacao, String[] referencia, int capacidade, String[] setores, int vagas)
	{
		this.nome 					=	nome;
		this.localizacao			=	localizacao;
		this.pontosReferencia 		=	new ArrayList<>();
		this.capacidadeTotal 		=	capacidade;
		this.setores 				=	new ArrayList<>();
		this.vagasEstacionamento 	=	vagas;
				
	}

	//Getters & Setters

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public ArrayList<String> getPontosReferencia() {
		return pontosReferencia;
	}


	public void setPontosReferencia(ArrayList<String> pontosReferencia) {
		this.pontosReferencia = pontosReferencia;
	}


	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}


	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}


	public ArrayList<String> getSetores() {
		return setores;
	}


	public void setSetores(ArrayList<String> setores) {
		this.setores = setores;
	}


	public int getVagasEstacionamento() {
		return vagasEstacionamento;
	}


	public void setVagasEstacionamento(int vagasEstacionamento) {
		this.vagasEstacionamento = vagasEstacionamento;
	}


	public String getTipoAmbiente() {
		return tipoAmbiente;
	}


	public void setTipoAmbiente(String tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}
	
	
}
