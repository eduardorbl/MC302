package Codes;

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//Constructor
	
	/**
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param anoFabricacao
	 */
	public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	//Getters & Setters

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the anoFabricacao
	 */
	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	/**
	 * @param anoFabricacao the anoFabricacao to set
	 */
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public String toString() {
		return "Veiculo " + this.marca + 
				" de modelo " + this.modelo +
				" com placa " +this.placa +
				" e fabricado em " + this.anoFabricacao + ".\n";
	}
	
	
	
	
	
	
}
