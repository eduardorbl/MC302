package Codes;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cliente
{
	private String nome;
	private String endereco;
	private ArrayList <Veiculo> listaVeiculos;
	
	
	public Cliente(String nome, String endereco, ArrayList<Veiculo> listaVeiculos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.listaVeiculos = listaVeiculos;
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
	@Override
	public String toString() {
		
		String listaVeiculosString = getListaVeiculos().stream().map(Veiculo::toString).collect(Collectors.joining(""));
	
		return "Esse cliente tem nome " + getNome() + 
		". Reside em " + getEndereco() +
		". Possui o(s) veiculo(s): " + listaVeiculosString + ".";
	}
		
	
}
