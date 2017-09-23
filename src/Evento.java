import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Evento 
{
	// Atributos Evento

	protected String					nome;
	protected Data						data;
	protected Hora						hora;	
	protected Ambiente					local;
	protected ArrayList<Ingresso>		ingressos;

	//Encapsulando

	public Evento(Data data, Hora hora, Ambiente local)
	{
		this.data 				=		data;
		this.hora				= 		hora;
		this.ingressos 			=		new ArrayList<>();
		this.setLocalDeRealização(local);
	}

	//Getters & Setters

	public Data getData() 
	{
		return data;
	}

	public void setData(Data data) 
	{
		this.data = data;
	}

	public Hora getHora() 
	{
		return hora;
	}

	public void setHora(Hora hora) 
	{
		this.hora = hora;
	}

	public ArrayList<Ingresso> getIngressos() 
	{
		return ingressos;
	}

	public void setIngressos(ArrayList<Ingresso> ingressos) 
	{
		this.ingressos = ingressos;
	}
	

	public Ambiente getLocal() 
	{
		return local;
	}

	public void setLocalDeRealização(Ambiente local) 
	{
		this.local = local;
	}
	
	public ArrayList<Ingresso> gerarIngressos (float preco)
	{
		int totalIngressos = local.getCapacidadeTotal();
		
		for (int i=0; i<totalIngressos; i++)
		{
			Ingresso ing = new Ingresso (i, preco);
			ingressos.add(ing);
		}
		return ingressos;
	}
	
	
	public void getDados()
	{
		System.out.print("Data "+data);
		System.out.print(" Hora: "+hora);
		System.out.print(" Local de Realização : " +local);

	}
	
	public Ingresso getIngresso()
	{
		Ingresso ing = null;
		
		for (Ingresso ingresso : ingressos)
		{
			if(!ingresso.isVendido())
			{
				ing = ingresso;
				ing.setVendido();
				break;
			}
		}
		return ing;
	}
}