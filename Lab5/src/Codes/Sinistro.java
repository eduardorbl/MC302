package Codes;
import java.util.ArrayList;
import java.util.Date;

public class Sinistro {

	private int id;
	private Date data;
	private String endereco;
	private Seguradora seguradora;
	private Condutor condutor;
	private static ArrayList <Integer> listaID;
	
	//Constructor
	
	/**
	 * 
	 * @param data
	 * @param endereco
	 * @param seguradora
	 * @param condutor
	 */
	public Sinistro(Date data, String endereco, Seguradora seguradora, Condutor condutor) {
		super();
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.condutor = condutor;		
		
		if (listaID == null)
		{	
			listaID = new ArrayList<Integer>();
			listaID.add(0);
			this.id = 0;

		} else 
		{
			this.id = listaID.get(listaID.size()-1) + 1;
			listaID.add(this.id);
		}
		
	
	}
	
	//Getters & Setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
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
	 * @return the seguradora
	 */
	public Seguradora getSeguradora() {
		return seguradora;
	}

	/**
	 * @param seguradora the seguradora to set
	 */
	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	/**
	 * @return the condutor
	 */
	public Condutor getCondutor() {
		return condutor;
	}

	/**
	 * @param condutor the condutor to set
	 */
	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	/**
	 * @return the listaID
	 */
	public static ArrayList<Integer> getListaID() {
		return listaID;
	}

	/**
	 * @param listaID the listaID to set
	 */
	public static void setListaID(ArrayList<Integer> listaID) {
		Sinistro.listaID = listaID;
	}

		
	
}
