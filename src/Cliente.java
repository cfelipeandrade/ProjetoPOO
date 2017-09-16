import java.util.ArrayList;

/**
 * 
 * @author Felipe Andrade
 *
 */

public class Cliente 
{

	// Atributos Cliente
	
	private	String				nome;
	private	int					cpf;
	private String 				dataNascimento;
	private String				eMail;
	private ArrayList<String>	telefone;
	private String				login;
	private int					senha;
	private ArrayList<Compra>	histCompras;
	
	
	
	//Encapsulando
	
	public Cliente(String nome, int cpf, String nasc, String mail, String tel, String login, int senha)
	{
		this.nome				= nome;
		this.cpf				= cpf;
		this.dataNascimento 	= nasc;
		this.eMail				= mail;
		this.telefone 			= new ArrayList<>();
		this.telefone.add(tel);
		this.histCompras        = new ArrayList<>();
		this.senha				= senha;
		this.login				= login;
	}

	//Getters & Setters

	public String getNome() 
	{
		return nome;
	}



	public void setNome(String nome) 
	{
		this.nome = nome;
	}



	public int getCpf() 
	{
		return cpf;
	}



	public String getDataNascimento() 
	{
		return dataNascimento;
	}



	public String geteMail() 
	{
		return eMail;
	}



	public void seteMail(String eMail) 
	{
		this.eMail = eMail;
	}



	public ArrayList<String> getTelefone() 
	{
		return telefone;
	}



	public void setNovoTelefone(String telefone) 
	{
		this.telefone.add(telefone);
	}

	//Historico de Compras
	
	public void addCompra (Compra compra)
	{
		histCompras.add(compra);
	}


	
	
	
	
	
	
	
}
