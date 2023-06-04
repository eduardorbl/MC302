package Codes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ClientePF extends Cliente{
	
	private String cpf;
	private String genero;
	private String educacao;
	private Date dataNascimento;
	private ArrayList<Veiculo> listaVeiculos;
	
	//Constructor
	
	/**
	 * 
	 * @param nome
	 * @param telefone
	 * @param endereco
	 * @param email
	 * @param valorSeguro
	 * @param cpf
	 * @param genero
	 * @param educacao
	 * @param dataNascimento
	 * @param listaVeiculos
	 */
	public ClientePF(String nome, String telefone, String endereco, String email, double valorSeguro, String cpf,
			String genero, String educacao, Date dataNascimento, ArrayList<Veiculo> listaVeiculos) {
		super(nome, telefone, endereco, email, valorSeguro);
		this.cpf = cpf;
		this.genero = genero;
		this.educacao = educacao;
		this.dataNascimento = dataNascimento;
		this.listaVeiculos = listaVeiculos;
	}
	
	//Getters & Setter
	
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
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the educacao
	 */
	public String getEducacao() {
		return educacao;
	}

	/**
	 * @param educacao the educacao to set
	 */
	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the listaVeiculos
	 */
	public ArrayList<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	/**
	 * @param listaVeiculos the listaVeiculos to set
	 */
	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	/**
	 * 
	 * @param veiculo
	 * @return
	 */
	public boolean removerVeiculo (Veiculo veiculo)
	{
		return listaVeiculos.remove(veiculo);
	}
	
	/*
	 * Determina o valor do fator de idade do cliente
	 */
	public double fatorIdade ()
	{
		Calendar calendarNascimento = Calendar.getInstance();
		Calendar calendarAtual = Calendar.getInstance();
		
		calendarNascimento.setTime(dataNascimento);
		
		int idade = calendarAtual.get(Calendar.YEAR) - calendarNascimento.get(Calendar.YEAR);
		
		if (calendarAtual.get(Calendar.MONTH) < calendarNascimento.get(Calendar.MONTH) || 			
				(calendarAtual.get(Calendar.MONTH) == calendarNascimento.get(Calendar.MONTH) && calendarAtual.get(Calendar.DAY_OF_MONTH) < calendarNascimento.get(Calendar.DAY_OF_MONTH)))
		{
			idade--;
		}
		
		if (18 < idade && idade <= 30)
		{
			return CalcSeguro.FATOR_18_30.getConstante();	
		} else if (30 < idade && idade <= 60)
		{
			return CalcSeguro.FATOR_30_60.getConstante();
		} else 
		{
			return CalcSeguro.FATOR_60_90.getConstante();
		} 
	}

	
	

}
