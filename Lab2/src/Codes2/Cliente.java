package Codes2;

public class Cliente
{
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private int idade;
	
	//Constructor
	public Cliente (String nome, String cpf, String dataNascimento, int idade)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}
	
	//Getter & Setter
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getDataNascimento() 
	{
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) 
	{
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}

	public boolean validarCPF()
	{
	    String cpf_int = this.cpf.replaceAll("[^\\d]", "");

	    if (cpf_int.length() != 11) {
	        return false;
	    }

	    boolean allEqual = true;
	    for (int i = 0; i < cpf_int.length(); i++) {
	        if (cpf_int.charAt(9) != cpf_int.charAt(i)) {
	            allEqual = false;
	            break;
	        }
	    }
	    if (allEqual) {
	        return false;
	    }

	    int n = 0;
	    int d1, d2;

	    for (int i = 0; i < 9; i++) {
	        n += Character.getNumericValue(cpf_int.charAt(i)) * (10 - i);
	    }
	    d1 = 11 - n % 11;
	    if (d1 > 9) {
	        d1 = 0;
	    }

	    n = 0;
	    for (int i = 0; i < 10; i++) {
	        n += Character.getNumericValue(cpf_int.charAt(i)) * (11 - i);
	    }
	    d2 = 11 - (n % 11);
	    if (d2 > 9) {
	        d2 = 0;
	    }

	    if (d1 == Character.getNumericValue(cpf_int.charAt(9)) && d2 == Character.getNumericValue(cpf_int.charAt(10))) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
