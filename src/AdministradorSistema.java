/**
 * 
 * @author Felipe Andrade
 *
 */

public class AdministradorSistema 
{

	private String 		nome;
	private String		login;
	private String 		senha;
	private int 		cpf;
	
	//Encapsulando
	
	public AdministradorSistema(String nome, String login, String senha, int cpf)
	{
		//Dados do Administrador
		
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	//Getters & Setters


	public String getLogin() 
	{
		return login;
	}
	
	public void setLogin(String login) 
	{
		this.login = login;
	}
	
	public String getSenha() 
	{
		return senha;
	}
	
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public int getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(int cpf) 
	{
		this.cpf = cpf;
	}
}
