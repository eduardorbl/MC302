package Codes;
import java.util.ArrayList;

public class Sinistro {

	private final int id;
	private String data;
	private String endereco;
	private Seguradora seguradora;
	private Veiculo veiculo;
	private Cliente cliente;
	private static ArrayList <Integer> listaID;
	
	//Constructor
	public Sinistro(int id, String data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente) {
		super();
		this.id = id;
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.veiculo = veiculo;
		this.cliente = cliente;
		
		if (listaID == null)
		{
			listaID = new ArrayList<>();
		}
		listaID.add(id);
		
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

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "O sinistro de ID " + id +
				" ocorreu na data " + data +
				" no endereço " + endereco + ".\n"
				+ "Realizado pela seguradora " + seguradora.getNome() +
				", sendo o veiculo " + veiculo.getModelo() +
				" pertencente ao cliente " + cliente.getNome() +".\n";
				
	}

	
}
