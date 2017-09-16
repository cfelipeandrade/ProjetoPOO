import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Evento 
{
	// Atributos Cliente

	protected String					data;
	protected String					horarioRealizacao;
	protected ArrayList<Ingresso>		ingressos;
	
	//Encapsulando
	
	public Evento(String data, String horario)
	{
		this.data 				=	data;
		this.horarioRealizacao 	=	horario;
		this.ingressos 			=	new ArrayList<>();
	}

	//Getters & Setters
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorarioRealizacao() {
		return horarioRealizacao;
	}

	public void setHorarioRealizacao(String horarioRealizacao) {
		this.horarioRealizacao = horarioRealizacao;
	}
	
	
	
	
	
}
