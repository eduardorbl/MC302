package Codes;

abstract class Cliente
{

	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	double valorSeguro;
	
	public Cliente(String nome, String telefone, String endereco, String email, double valorSeguro) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
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
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
