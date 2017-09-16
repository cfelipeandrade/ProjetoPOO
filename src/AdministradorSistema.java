/**
 * 
 * @author Felipe Andrade
 *
 */

public class AdministradorSistema 
{

	private String	login;
	private int		senha;
	
	//Encapsulando
	
	public AdministradorSistema(String login, int senha)
	{
		this.login	=	login;
		this.senha 	=	senha;
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

	public int getSenha() 
	{
		return senha;
	}


	
	
	
	
}
