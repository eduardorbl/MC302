package Codes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ClientePJ extends Cliente {
	

	private String cnpj;
	private Date dataFundacao;
	private int quantidadeFunc;
	private ArrayList<Frota> listaFrota;
	
	//Constructor
	
	/**
	 * 
	 * @param nome
	 * @param telefone
	 * @param endereco
	 * @param email
	 * @param valorSeguro
	 * @param cnpj
	 * @param dataFundacao
	 * @paramquantidadeFunc
	 */
	public ClientePJ(String nome, String telefone, String endereco, String email, double valorSeguro, String cnpj,
			Date dataFundacao, int quantidadeFunc) 
	{
		super(nome, telefone, endereco, email, valorSeguro);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
		this.quantidadeFunc = quantidadeFunc;
		this.listaFrota = new ArrayList<Frota>();
	}

	//Getters & Setters
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the dataFundacao
	 */
	public Date getDataFundacao() {
		return dataFundacao;
	}

	/**
	 * @param dataFundacao the dataFundacao to set
	 */
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	/**
	 * @return the quantidadeFunc
	 */
	public int getQuantidadeFunc() {
		return quantidadeFunc;
	}

	/**
	 * @param quantidadeFunc the quantidadeFunc to set
	 */
	public void setQuantidadeFunc(int quantidadeFunc) {
		this.quantidadeFunc = quantidadeFunc;
	}

	/**
	 * @return the listaFrota
	 */
	public ArrayList<Frota> getListaFrota() {
		return listaFrota;
	}

	/**
	 * @param listaFrota the listaFrota to set
	 */
	public void setListaFrota(ArrayList<Frota> listaFrota) {
		this.listaFrota = listaFrota;
	}

	// Methods 
	/**
	 * 
	 * @param frota
	 * @return
	 */
	public boolean cadastrarFrota(Frota frota)
	{
		return listaFrota.add(frota);
	}
	/**
	 * 
	 * @return quantity of veiculos of cliente
	 */
	public int quantidadeVeiculos()
	{
		int quantidade = 0;
		for (Frota frota: listaFrota)
		{
			quantidade += frota.quantidadeVeiculos();
		}
		
		return quantidade;
	}
	/**
	 * 
	 * @param atualiza
	 * @param frota
	 * @param veiculo
	 * @return
	 */
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
				return getListaFrota().remove(frota);
			} else
			{
				return true;
			}
		}
	
	}
	/**
	 * 
	 * @return age after foundation of cliente
	 */
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
	/**
	 * 
	 * @param frota
	 * @return list of veiculos in frota
	 */
	public ArrayList<Veiculo> getVeiculosPorFrota (Frota frota)
	{
		return frota.getListaVeiculos();
	}
	
	public boolean excluirFrota (Frota frota)
	{
		return listaFrota.remove(frota);
	}

}
