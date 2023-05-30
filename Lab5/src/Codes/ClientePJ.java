package Codes;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class ClientePJ extends Cliente {
	
	public ClientePJ(String nome, String endereco, ArrayList<Veiculo> listaVeiculos, String cnpj, Date dataFundacao, int qtdeFuncionarios, double valorSeguro) {
		super(nome, endereco, listaVeiculos, valorSeguro);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
		this.qtdeFuncionarios = qtdeFuncionarios;
	}
	
	private final String cnpj;
	private Date dataFundacao;
	private int qtdeFuncionarios;
	
	
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCNPJ() {
		return cnpj;
	}
	
	@Override
	public String toString()
	{
		String listaVeiculosString = getListaVeiculos().stream().map(Veiculo::toString).collect(Collectors.joining(""));
		
		return "Esse cliente tem nome " + getNome() + 
		". Reside em " + getEndereco() +
		". Possui o(s) veiculo(s): " + listaVeiculosString + ".\n" +
		"Essa pessoa juridica possui o CNPJ " + getCNPJ() +
		" e data de fundacao " + getDataFundacao() + ".";	
	}
	
	public double calculaScore()
	{
		double VALOR_BASE = CalcSeguro.VALOR_BASE.getConstante();
		int qtdVeiculos = getListaVeiculos().size();
		
		double Score = VALOR_BASE * (1 + (qtdeFuncionarios)/100) * qtdVeiculos;
		
		return Score;
	}
	public int getQtdeFuncionarios() {
		return qtdeFuncionarios;
	}
	public void setQtdeFuncionarios(int qtdeFuncionarios) {
		this.qtdeFuncionarios = qtdeFuncionarios;
	}
	public String getCnpj() {
		return cnpj;
	}

}
