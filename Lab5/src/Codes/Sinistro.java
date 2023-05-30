package Codes;
import java.util.ArrayList;

public class Sinistro {

	private final int id;
	private String data;
	private String endereco;
	private Seguradora seguradora;
	private Condutor condutor;
	private static ArrayList <Integer> listaID;
	
	//Constructor
	public Sinistro(String data, String endereco, Seguradora seguradora, Condutor condutor) {
		super();
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.condutor = condutor;		
		
		if (listaID == null)
		{
			listaID = new ArrayList<>();
			listaID.add(0);
			this.id = 0;

		} else 
		{
			this.id = listaID.size();
			listaID.add(listaID.size());
		}
		
		
		
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

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	public static ArrayList<Integer> getListaID() {
		return listaID;
	}

	public int getId() {
		return id;
	}	
	
}
