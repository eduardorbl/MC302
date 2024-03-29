package Codes;
import java.util.ArrayList;
import java.util.stream.Collectors;

abstract class Cliente
{

	private String nome;
	private String endereco;
	private ArrayList <Veiculo> listaVeiculos;
	double valorSeguro;
	
	
	public Cliente(String nome, String endereco, ArrayList<Veiculo> listaVeiculos, double valorSeguro) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.listaVeiculos = listaVeiculos;
		this.valorSeguro = valorSeguro;
	}
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}
	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
	
	public void addVeiculo (Veiculo veiculo)
	{
		if (listaVeiculos == null)
		{
			listaVeiculos = new ArrayList<>();
			listaVeiculos.add(veiculo);
		}else
		{
		this.listaVeiculos.add(veiculo);
		}
	}
	
	public void excluirVeiculo (Veiculo veiculo)
	{
		for (Veiculo v: listaVeiculos)
		{
			if (v == veiculo)
			{
				this.listaVeiculos.remove(v);
			}
		}
	}
	
	@Override
	public String toString() {
		
		String listaVeiculosString = getListaVeiculos().stream().map(Veiculo::toString).collect(Collectors.joining(""));
	
		return "Esse cliente tem nome " + getNome() + 
		". Reside em " + getEndereco() +
		". Possui o(s) veiculo(s): " + listaVeiculosString + ".";
	}
		
	public abstract double calculaScore();
}
