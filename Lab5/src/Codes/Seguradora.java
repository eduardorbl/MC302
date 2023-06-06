package Codes;
import java.util.ArrayList;


public class Seguradora 
{
	private final String cnpj; 
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private ArrayList <Seguro> listaSeguros;
	private ArrayList <Cliente> listaClientes;
	
	/**
	 * @param cnpj
	 * @param nome
	 * @param telefone
	 * @param endereco
	 * @param email
	 * 
	 */
	public Seguradora(String cnpj, String nome, String telefone, String endereco, String email) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.listaSeguros = new ArrayList<Seguro>();
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}


	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}


	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the listaSeguros
	 */
	public ArrayList<Seguro> getListaSeguros() {
		return listaSeguros;
	}


	/**
	 * @param listaSeguros the listaSeguros to set
	 */
	public void setListaSeguros(ArrayList<Seguro> listaSeguros) {
		this.listaSeguros = listaSeguros;
	}


	/**
	 * @return the listaClientes
	 */
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}


	/**
	 * @param listaClientes the listaClientes to set
	 */
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	//Methods
	
	public void listarClientes ()
	{
		for (Cliente cliente: listaClientes)
		{
			System.out.println(cliente);
		}
	}
	/**
	 * 
	 * @param seguro
	 * @return
	 */
	
	public boolean gerarSeguro (Seguro seguro)
	{
		return listaSeguros.add(seguro);
	}
	/**
	 * 
	 * @param seguro
	 * @return
	 */
	public boolean cancelarSeguro (Seguro seguro)
	{
		return listaSeguros.remove(seguro);
	}
	/**
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean cadastrarCliente (Cliente cliente)
	{
		return listaClientes.add(cliente);
	}
	/**
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean removerCliente (Cliente cliente)
	{
		return listaClientes.remove(cliente);
	}
	/**
	 * 
	 * @param cliente
	 * @return ArrayList of Seguros per CLiente
	 */
	public ArrayList<Seguro> getSegurosPorCliente (Cliente cliente)
	{
		ArrayList<Seguro> listaSegPorCliente = new ArrayList<Seguro>();
		for (Seguro seguro: listaSeguros)
		{
			if (seguro.getCliente() == cliente)
			{
				listaSegPorCliente.add(seguro);
			}
		}
		
		return listaSegPorCliente;
	}
	
	/**
	 * 
	 * @param cliente
	 * @return ArrayList with all sinistros from a cliente
	 */
	public ArrayList<Sinistro> getSinistrosPorCliente (Cliente cliente)
	{
		ArrayList<Sinistro> listaSinistroPorCliente = new ArrayList<Sinistro>();
		
		ArrayList<Seguro> listaSegurosDoCliente = getSegurosPorCliente(cliente);
		for (Seguro seguro: listaSegurosDoCliente)
		{
			listaSinistroPorCliente.addAll(seguro.getListaSinistros());
		}
		return listaSinistroPorCliente;
	}
	public double calcularReceita()
	{
		double Receita = 0;
		for (Seguro seguro: listaSeguros)
		{	
			seguro.atualizaValorMensal();
			Receita += seguro.getValorMensal();		
		}
		return Receita;	
	}
	
	public boolean excluirSeguro (Seguro seguro)
	{
		return listaSeguros.remove(seguro);
	}
	@Override
	public String toString() {
		return "Seguradora " + nome + " possui telefone "
				+ telefone + " e email " + email + " e endereco "
				+ endereco;
	}
	
	
}
