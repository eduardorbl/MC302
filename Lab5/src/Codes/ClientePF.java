package Codes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ClientePF extends Cliente{
	
	private final String cpf;
	private String genero;
	private String educacao;
	private Date dataNascimento;
	private ArrayList<Veiculo> listaVeiculos;
	
	
	
	public ClientePF(String nome, String telefone, String endereco, String email, double valorSeguro, String cpf,
			String genero, String educacao, Date dataNascimento, ArrayList<Veiculo> listaVeiculos) {
		super(nome, telefone, endereco, email, valorSeguro);
		this.cpf = cpf;
		this.genero = genero;
		this.educacao = educacao;
		this.dataNascimento = dataNascimento;
		this.listaVeiculos = listaVeiculos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public String getCPF() {
		return cpf;
	}

	public ArrayList<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
	
	public boolean cadastrarVeiculo (Veiculo veiculo)
	{
		return listaVeiculos.add(veiculo);
	}
	
	public boolean removerVeiculo (Veiculo veiculo)
	{
		return listaVeiculos.remove(veiculo);
	}
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
