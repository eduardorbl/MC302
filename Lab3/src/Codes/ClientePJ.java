package Codes;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class ClientePJ extends Cliente {
	
	public ClientePJ(String nome, String endereco, ArrayList<Veiculo> listaVeiculos, String cnpj, Date dataFundacao) {
		super(nome, endereco, listaVeiculos);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
	}
	
	private final String cnpj;
	private Date dataFundacao;
	
	
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCNPJ() {
		return cnpj;
	}
	
	public boolean validarCNPJ()
	{
		String cnpj_int = this.cnpj.replaceAll("[^\\d]", "");
	
		if (cnpj_int.length() != 14)
		{
			return false;
		}
	
		boolean allEqual = true;
		
		for (int i = 0; i < cnpj_int.length(); i++)
		{
			if (cnpj_int.charAt(0) != cnpj_int.charAt(i))
			{
				allEqual = false;
				break;
			}
		}
		
		if (allEqual)
		{
			return false;
		}
		
		int d1, d2 = 0;
		int soma = 0;
		for (int m = 5; m > 1; m--)
		{
			soma += m * Character.getNumericValue(cnpj_int.charAt(5-m));
		}
		for (int m = 9; m > 1; m--)
		{
		soma += m * Character.getNumericValue(cnpj_int.charAt(13-m));
		}
			
		if (soma%11 < 2)
		{
			d1 = 0;
		} else
		{
			d1 = soma/11 - soma%11;
		}
		
		soma = 0;
		
		for (int m = 6; m > 1; m--)
		{
			soma += m * Character.getNumericValue(cnpj_int.charAt(6-m));
		}
		for (int m = 9; m > 1; m--)
		{
			soma += m * Character.getNumericValue(cnpj_int.charAt(14-m));
		}
		
		if (soma%11 < 2)
		{
			d2 = 0;
		} else
		{
			d1 = 11 - soma%11;
		}
		
		if (d1 == Character.getNumericValue(cnpj_int.charAt(12))
				&& d2 == Character.getNumericValue(cnpj_int.charAt(13)))
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		String listaVeiculosString = getListaVeiculos().stream().map(Veiculo::toString).collect(Collectors.joining(""));
		
		return "Esse cliente tem nome " + getNome() + 
		". Reside em " + getEndereco() +
		". Possui o(s) veículo(s): " + listaVeiculosString + ".\n" +
		"Essa pessoa jurídica possui o CNPJ " + getCNPJ() +
		"e data de fundação " + getDataFundacao() + ".\n";	
	}

}
