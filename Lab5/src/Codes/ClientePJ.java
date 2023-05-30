package Codes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ClientePJ extends Cliente {
	

	private final String cnpj;
	private Date dataFundacao;
	private int quantidadeFunc;
	private ArrayList<Frota> listaFrota;
	
	public ClientePJ(String nome, String telefone, String endereco, String email, double valorSeguro, String cnpj,
			Date dataFundacao, int quantidadeFunc, ArrayList<Frota> listaFrota) {
		super(nome, telefone, endereco, email, valorSeguro);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
		this.quantidadeFunc = quantidadeFunc;
		this.listaFrota = listaFrota;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCNPJ() {
		return cnpj;
	}
	public ArrayList<Frota> getListaFrota() {
		return listaFrota;
	}
	public void setListaFrota(ArrayList<Frota> listaFrota) {
		this.listaFrota = listaFrota;
	}
		
	public boolean removerFrotadaListaFrota (Frota frota)
	{
		return listaFrota.remove(frota);
	}
	public String getCnpj() {
		return cnpj;
	}
	public int getQuantidadeFunc() {
		return quantidadeFunc;
	}
	public void setQuantidadeFunc(int quantidadeFunc) {
		this.quantidadeFunc = quantidadeFunc;
	}
	public boolean cadastrarFrota(Frota frota)
	{
		return listaFrota.add(frota);
	}
	public int quantidadeVeiculos()
	{
		int quantidade = 0;
		for (Frota frota: listaFrota)
		{
			quantidade += frota.quantidadeVeiculos();
		}
		
		return quantidade;
	}
	public boolean atualizarFrota(boolean atualiza, Frota frota, Veiculo veiculo)
	{	

		if (atualiza)
		{
			return frota.addVeiculo(veiculo);
		} else
		{
			frota.removeVeiculo(veiculo);
			if (frota.getListaVeiculos().size() == 0)
			{
				return removerFrotadaListaFrota(frota);
			} else
			{
				return true;
			}
		}
	
	}
	
	public int anosPosFundacao ()
	{
		Calendar calendarNascimento = Calendar.getInstance();
		Calendar calendarAtual = Calendar.getInstance();
		
		calendarNascimento.setTime(dataFundacao);
		
		int idade = calendarAtual.get(Calendar.YEAR) - calendarNascimento.get(Calendar.YEAR);
		
		if (calendarAtual.get(Calendar.MONTH) < calendarNascimento.get(Calendar.MONTH) || 			
				(calendarAtual.get(Calendar.MONTH) == calendarNascimento.get(Calendar.MONTH) && calendarAtual.get(Calendar.DAY_OF_MONTH) < calendarNascimento.get(Calendar.DAY_OF_MONTH)))
		{
			idade--;
		}
		
		return idade;
	}
	
	public boolean getVeiculosPorFrota ()
	{
		return true;
	}
}
