package Codes;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class ClientePF extends Cliente{
	
	private final String cpf;
	private String genero;
	private Date dataLicenca;
	private String educacao;
	private Date dataNascimento;
	private String classeEconomica;
	
	public ClientePF(String nome, String endereco, ArrayList<Veiculo> listaVeiculos, String cpf, String genero,
			Date dataLicenca, String educacao, Date dataNascimento, String classeEconomica) {
		super(nome, endereco, listaVeiculos);
		this.cpf = cpf;
		this.genero = genero;
		this.dataLicenca = dataLicenca;
		this.educacao = educacao;
		this.dataNascimento = dataNascimento;
		this.classeEconomica = classeEconomica;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getDataLicenca() {
		return dataLicenca;
	}

	public void setDataLicenca(Date dataLicenca) {
		this.dataLicenca = dataLicenca;
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	public String getCPF() {
		return cpf;
	}
	
	public String getCpf() {
		return cpf;
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

	@Override
	public String toString() {
		
		String listaVeiculosString = getListaVeiculos().stream().map(Veiculo::toString).collect(Collectors.joining(""));
		
		return "Esse cliente tem nome " + getNome() + 
				". Reside em " + getEndereco() +
				". Possui o(s) veículo(s): " + listaVeiculosString + ".\n" +
				"Essa pessoa física tem CPF " + getCPF() +
				", tem gênero" + getGenero() +
				", sua data de licença é" + getDataLicenca() +
				", em educação " + getEducacao() +
				", sua data de nascimento é " + getDataNascimento() +
				"e possui classe econômica " + getClasseEconomica() +".\n";
	}
}
