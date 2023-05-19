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
	
	public ArrayList<Sinistro> getListaSinistros() {
		return listaSinistros;
	}

	public void setListaSinistros(ArrayList<Sinistro> listaSinistros) {
		this.listaSinistros = listaSinistros;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
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
		
		if (listaClientes == null)
		{
			listaClientes = new ArrayList<>();
		} 
		
		return listaClientes.add(cliente);

	}
	
	public boolean removerCliente (Cliente cliente)
	{		
		
		return listaClientes.remove(cliente);
		
	}
	
	public boolean gerarSinistro (Sinistro sinistro)
	{
		
		if (listaSinistros == null)
		{
			listaSinistros = new ArrayList<>();
		}
		
		return this.listaSinistros.add(sinistro);
	}
	
	public void removerSinistro(Sinistro sinistro)
	{
		listaSinistros.remove(sinistro);
	}
	
	public boolean visualizarSinistro (String cliente)
	{
		boolean sinistroExiste = false;
		for (int i = 0; i < listaSinistros.size(); i++)
		{
			if (listaSinistros.get(i).getCliente().getNome().equals(cliente))
			{
				listaSinistros.get(i).toString();
				sinistroExiste = true;
			}
		}
		
		return sinistroExiste;	
	}
	
	public void listarSinistros()
	{	
		
		for (int i = 0; i < listaSinistros.size(); i++)
		{	
			System.out.println(listaSinistros.get(i).toString());			
		}
		
	}
	
	public int qtdSinistros(Cliente cliente)
	{
		int qtd = 0;
		for (int i = 0; i < listaSinistros.size(); i++)
		{
			if (listaSinistros.get(i).getCliente().equals(cliente))
			{		
				qtd++;
			}
		}
		
		return qtd;	
	}
	
	public String listarClientes()
	{
		String listaClientesString = "";
		
		for (int i = 0; i < listaClientes.size(); i++)
		{
			listaClientesString += listaClientes.get(i).toString() + "\n";
		}
		
		return listaClientesString;
	}
	
	public void calcularPrecoSeguroCliente()
	{
		for (int i = 0; i < listaClientes.size(); i++)
		{	
			listaClientes.get(i).setValorSeguro(listaClientes.get(i).calculaScore() * (1 + qtdSinistros(listaClientes.get(i))));
		}
		
	}
	
	public int calcularReceita()
	{
		int Receita = 0;
		for (int i = 0; i < listaClientes.size(); i++)
		{	
			
			Receita += listaClientes.get(i).getValorSeguro();		
		}
		
		return Receita;
		
		
	}

	@Override
	public String toString() {
		return "Seguradora " + nome + " possui telefone "
				+ telefone + " e email " + email + " e endereco "
				+ endereco;
	}
	
	
}
