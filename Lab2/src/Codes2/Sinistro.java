package Codes2;

public class Sinistro {

	private int id;
	private String data;
	private String endereco;
	public static int qtdIdsSinistros = 0;
	//Constructor
	public Sinistro (int id, String data, String endereco) {
		
		this.id = id;
		this.data = data;
		this.endereco = endereco;
	}
	
	//Getter & Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void gerarID () {
		
		int id = qtdIdsSinistros;
		qtdIdsSinistros++;
		
		this.id = id;
	}
	

}
