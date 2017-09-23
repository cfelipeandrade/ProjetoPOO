import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Compra 
{
	// Atributos Compra
	
	private int 					numero;
	private double					precoTotal;
	private String					formaPagamento;
	private int						quantIngresso;
	private Evento					evento;
	private ArrayList<Ingresso> 	ingresso;
	
	//Encapsulando
	
	public Compra(int numero, float preco, String pagamento)
	{
		this.numero 		= 	numero;
		this.precoTotal 	= 	preco;
		this.formaPagamento = 	pagamento;
	}
	
	//Getters & Setters
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public double getValor() 
	{
		return precoTotal;
	}
	
	public void setValor(float preco) 
	{
		this.precoTotal = preco;
	}
	
	public void setFpagamento(String pagamento)
	{
		this.formaPagamento 	=	pagamento;
	}
	
	public String getFpagamento()
	{
		return formaPagamento;
	}
	
	public int getQuantidade() {
		return quantIngresso;
	}

	public void setQuantidade(int quantidade) {
		this.quantIngresso = quantidade;
	}
	
	public double valorCompra(int quantidade, float preco){
		return ingresso.get(0).getPreco()*quantidade;
	}

	public void getIngressos(int quantidade)
	{
		for (int i = 0 ; i < quantidade ; i++)
		{
			Ingresso ing = evento.getIngresso();
			ingresso.add(ing);
		}
	}
}