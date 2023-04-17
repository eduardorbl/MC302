package Codes;
import java.util.ArrayList;


public class Seguradora 
{

	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private ArrayList <Sinistro> listaSinistros;
	private ArrayList <Cliente> listaClientes;

	//Constructor
	public Seguradora (String nome, String telefone, String email, String endereco)
	{
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;	
	}
	
	//Getter & Setter
	public String getNome ()
	{
		return this.nome;
	}
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	
	public String getTelefone ()
	{
		return this.telefone;
	}
	public void setTelefone (String telefone)
	{
		this.telefone = telefone;
	}
	
	public String getEmail ()
	{
		return this.email;
	}
	public void setEmail (String email)
	{
		this.email = email;
	}
	
	public String getEndereco ()
	{
		return this.endereco;
	}
	public void setEndereco (String endereco)
	{
		this.endereco = endereco;
	}

	public boolean cadastrarCliente (Cliente cliente)
	{
		listaClientes.add(cliente);
		return true;
	}
	
	public boolean removerCliente (Cliente cliente)
	{
		listaClientes.remove(cliente);
		return true;
	}
	
	public boolean gerarSinistro ()
	{
		Sinistro sinitro = new Sinistro(0, null, null, null, null, null);
		this.listaSinistros.add(sinitro);
		
		return true;	
	}
	
	public boolean visualizarSinistro (String cliente)
	{
		
		for (int i = 0; i < listaSinistros.size(); i++)
		{
			if (listaSinistros.get(i).getCliente().getNome() == cliente)
			{
				listaSinistros.get(i).toString();			
			}
		}
		
		return true;
	}
	
	public void listarSinistros()
	{
		for (int i = 0; i < listaSinistros.size(); i++)
		{	
			listaSinistros.get(i).toString();			
		}
		
	}
}
