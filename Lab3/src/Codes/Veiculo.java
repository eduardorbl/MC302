package Codes;

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//Constructor
	public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Veículo " + this.marca + 
				" de modelo " + this.modelo +
				" com placa " +this.placa +
				" e fabricado em " + this.anoFabricacao + ".\n";
	}
	
	
	
	
	
	
}
