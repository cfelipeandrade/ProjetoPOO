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
	private Data 				dataNascimento;
	private String				eMail;
	private ArrayList<String>	telefone;
	private String				login;
	private String				senha;
	private ArrayList<Compra>	histCompras;
	
	
	
	//Encapsulando
	
	public Cliente(String nome, int cpf, Data nasc, String mail, String tel, String login, String senha)
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
	
	public void setCpf(int cpf) 
	{
		this.cpf = cpf;
	}

	public Data getDataNascimento() 
	{
		return dataNascimento;
	}
	
	public void setDataNascimento(Data nascimento) 
	{
		this.dataNascimento	=	nascimento;
	}

	public String getEmail() 
	{
		return eMail;
	}

	public void setEmail(String eMail) 
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
	
	public String getLogin() 
	{
		return login;
	}
	
	public void setLogin(String login) 
	{
		this.login	=	login;
	}
	
	public String getSenha() 
	{
		return senha;
	}
	
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}

	//Historico de Compras
	
	public void addCompra (Compra compra)
	{
		histCompras.add(compra);
	}
	
	public ArrayList<Compra> getHistoricoCompras() 
	{
		return histCompras;
	}


	
	
	
	
	
	
	
}
