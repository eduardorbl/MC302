package Codes;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

import java.util.Calendar;

public class ClientePF extends Cliente{
	
	private final String cpf;
	private String genero;
	private Date dataLicenca;
	private String educacao;
	private Date dataNascimento;
	private String classeEconomica;
	
	public ClientePF(String nome, String endereco, ArrayList<Veiculo> listaVeiculos, String cpf, String genero,
			Date dataLicenca, String educacao, Date dataNascimento, String classeEconomica, double valorSeguro) {
		super(nome, endereco, listaVeiculos, valorSeguro);
		this.cpf = cpf;
		this.genero = genero;
		this.dataLicenca = dataLicenca;
		this.educacao = educacao;
		this.dataNascimento = dataNascimento;
		this.classeEconomica = classeEconomica;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getDataLicenca() {
		return dataLicenca;
	}

	public void setDataLicenca(Date dataLicenca) {
		this.dataLicenca = dataLicenca;
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	public String getCPF() {
		return cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		
		String listaVeiculosString = getListaVeiculos().stream().map(Veiculo::toString).collect(Collectors.joining(""));
		
		return "Esse cliente tem nome " + getNome() + 
				". Reside em " + getEndereco() +
				". Possui o(s) veiculo(s): " + listaVeiculosString + ".\n" +
				"Essa pessoa fisica tem CPF " + getCPF() +
				", tem genero " + getGenero() +
				", sua data de licenca eh " + getDataLicenca() +
				", em educacao " + getEducacao() +
				", sua data de nascimento eh " + getDataNascimento() +
				"e possui classe economica " + getClasseEconomica() +".";
	}
	
	
	private int idade ()
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
		
		return idade;
	}
	public double calculaScore()
	{
		int idade = idade();
		int qtdVeiculos = getListaVeiculos().size();
		double VALOR_BASE = CalcSeguro.VALOR_BASE.getConstante();
		double FATOR_18_30 = CalcSeguro.FATOR_18_30.getConstante();
		double FATOR_30_60 = CalcSeguro.FATOR_30_60.getConstante();
		double FATOR_60_90 = CalcSeguro.FATOR_60_90.getConstante();
		
		double Score = 0;
		if (idade < 30 && idade >= 18)
		{
			Score = VALOR_BASE * FATOR_18_30 * qtdVeiculos;
		} else if (idade >= 30 && idade < 60)
		{
			Score = VALOR_BASE * FATOR_30_60 * qtdVeiculos;
		} else if (idade >= 60 && idade <= 90)
		{
			Score = VALOR_BASE * FATOR_60_90 * qtdVeiculos;
		}
		
		return Score;
	}
}
