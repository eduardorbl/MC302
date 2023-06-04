package Codes;

import java.util.ArrayList;

public class Frota {

	private String code;
	private ArrayList<Veiculo> ListaVeiculos;
	
	//Constructor
	
	/**
	 * 
	 * @param code
	 * @param listaVeiculos
	 */
	public Frota(String code, ArrayList<Veiculo> listaVeiculos) {
		this.code = code;
		ListaVeiculos = listaVeiculos;
	}

	//Getters & Setters
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the listaVeiculos
	 */
	public ArrayList<Veiculo> getListaVeiculos() {
		return ListaVeiculos;
	}

	/**
	 * @param listaVeiculos the listaVeiculos to set
	 */
	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		ListaVeiculos = listaVeiculos;
	}

	//Methods
	
	/**
	 * 
	 * @param veiculo
	 * @return
	 */
	public boolean removeVeiculo (Veiculo veiculo)
	{
		return ListaVeiculos.remove(veiculo);
	}
	/**
	 * 
	 * @return quantity of veiculos in frota
	 */
	public int quantidadeVeiculos ()
	{
		return ListaVeiculos.size();
	}
	/**
	 * 
	 * @param veiculo
	 * @return
	 */
	public boolean addVeiculo(Veiculo veiculo) {
		
		return ListaVeiculos.add(veiculo);
		}
}
