/**
 * 
 * @author Felipe Andrade
 *
 */

public class Compra 
{

	private float		precoTotal;
	private String		formaPagamento;
	private String		dataCompra;
	private int			quantIngresso;
	
	//Encapsulando
	
	public Compra(float preco, String pagamento, String data)
	{
		this.precoTotal 	= preco;
		this.formaPagamento = pagamento;
		this.dataCompra		= data;
	}
	
	//Getters & Setters
	
	public void setFpagamento(String pagamento)
	{
		this.formaPagamento 	=	pagamento;
	}
	
	public String getFpagamento()
	{
		return formaPagamento;
	}


	public String getDataCompra() {
		return dataCompra;
	}


	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	
}
