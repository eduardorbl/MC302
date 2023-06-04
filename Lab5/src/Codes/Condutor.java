package Codes;

import java.util.ArrayList;
import java.util.Date;

public class Condutor {
	
	private String cpf;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private Date dataNasc;
	private ArrayList<Sinistro> listaSinistros;
	
	//Constructor 

	/**
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 * @param endereco
	 * @param email
	 * @param dataNasc
	 * @param listaSinistros
	 */
	public Condutor(String cpf, String nome, String telefone, String endereco, String email, Date dataNasc,
			ArrayList<Sinistro> listaSinistros) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.dataNasc = dataNasc;
		this.listaSinistros = listaSinistros;
	}

	//Getters & Setters

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	 * @return the dataNasc
	 */
	public Date getDataNasc() {
		return dataNasc;
	}

	/**
	 * @param dataNasc the dataNasc to set
	 */
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	/**
	 * @return the listaSinistros
	 */
	public ArrayList<Sinistro> getListaSinistros() {
		return listaSinistros;
	}

	/**
	 * @param listaSinistros the listaSinistros to set
	 */
	public void setListaSinistros(ArrayList<Sinistro> listaSinistros) {
		this.listaSinistros = listaSinistros;
	}
	
	//Methods
	
	/**
	 * 
	 * @param sinistro
	 * @return
	 */
	public boolean adcionarSinistro (Sinistro sinistro)
	{	
		return listaSinistros.add(sinistro);
	}
}
