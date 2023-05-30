package Codes;

import java.util.ArrayList;

public class Frota {

	private String code;
	private ArrayList<Veiculo> ListaVeiculos;
	public Frota(String code, ArrayList<Veiculo> listaVeiculos) {
		super();
		this.code = code;
		ListaVeiculos = listaVeiculos;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ArrayList<Veiculo> getListaVeiculos() {
		return ListaVeiculos;
	}
	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		ListaVeiculos = listaVeiculos;
	}
	public boolean addVeiculo (Veiculo veiculo)
	{
		return ListaVeiculos.add(veiculo);
	}
	public boolean removeVeiculo (Veiculo veiculo)
	{
		return ListaVeiculos.remove(veiculo);
	}
	public int quantidadeVeiculos ()
	{
		return ListaVeiculos.size();
	}
}
