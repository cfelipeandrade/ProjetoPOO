import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Show extends Evento
{

	// Atributos Show
	
	private String 				bandaArtista;
	private String 				tituloShow;
	
	//Encapsulando
	
	public Show(Data data, Hora horario, Ambiente local, String artista, String titulo) {
		super(data, horario, local);
		
		this.setBanda(artista);
		this.setTituloShow(tituloShow);	
		
	}
	
	//Getters & Setters
	
	public String getTituloShow() 
	{
		return tituloShow;
	}

	public void setTituloShow(String tituloShow) 
	{
		this.tituloShow = tituloShow;
	}

	public String getBanda() 
	{
		return bandaArtista;
	}

	public void setBanda(String artista) 
	{
		this.bandaArtista = artista;
	}



	
}

