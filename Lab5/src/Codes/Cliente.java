package Codes;

abstract class Cliente
{

	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	double valorSeguro;
	
	/**
	 * 
	 * @param nome
	 * @param telefone
	 * @param endereco
	 * @param email
	 * @param valorSeguro
	 */
	public Cliente(String nome, String telefone, String endereco, String email, double valorSeguro) 
	{
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.valorSeguro = valorSeguro;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the valorSeguro
	 */
	public double getValorSeguro() {
		return valorSeguro;
	}

	/**
	 * @param valorSeguro the valorSeguro to set
	 */
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	@Override
	public String toString() {
		return String.format("Cliente se chama nome=%s, possui telefone telefone=%s, reside em endereco=%s, email email=%s e paga valorSeguro=%s R$ por mes", nome, telefone,
				endereco, email, valorSeguro);
	}
	
}
