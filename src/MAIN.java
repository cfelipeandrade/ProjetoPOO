import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class MAIN {

	public static void main(String[] args) 
	{
		
		
		AdministradorSistema adm = new AdministradorSistema ("Tenchi Masaki", "tenchi", "1234",0675411130);
		
		Data nascimento	 = new Data (25,"Janeiro",1991); //Nascimento Cliente
		
		Data newEvento1 = new Data (22,"Setembro",2017); //data evento1
		
		Hora newEvento1hora = new Hora (18,55);
		
				
		Cliente cliente  = new Cliente("Ryoko Hakubi",0675411125,nascimento,"pirataespacial@gmail.com","99996666","ryoko","s2tenchi");
		System.out.println("Cadastro do cliente "+ cliente.getNome()+"realizado com sucesso.");
				
		Ambiente cinema = new Cinema ("Cinesercla", "Partage Shopping Campina Grande", 1500, 80);
		System.out.println("Cadastro do cinema "+ cinema.getLocalizacao()+" no "+cinema.getPontosReferencia()+" foi realizado com suscesso.");
					
		Evento evento1 = new Filme (newEvento1, newEvento1hora, cinema, "A volta dos que não foram", "seuninguem", "sapulha", "um filme filmado com filmadora","humor",18);
		System.out.println("Evento no cinema "+evento1.getLocal().getLocalizacao()+" realizado com sucesso. \nData: "+evento1.getData()+"\nHorario: "+evento1.getHora());
		
		
				
		System.out.println(evento1.gerarIngressos(30));
		
		
		
	
		
	
		
	}
		
}