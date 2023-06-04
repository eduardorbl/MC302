package Codes;

import java.util.ArrayList;
import java.util.Date;

public abstract class Seguro {
	
	private final int id;
	private Date dataInicio;
	private Date dataFim;
	private Seguradora seguradora;
	private ArrayList<Sinistro> listaSinistros;
	private ArrayList<Condutor> listaCondutores;
	private int valorMensal;
	
	/**
	 * Constructor
	 * @param id
	 * @param dataInicio
	 * @param dataFim
	 * @param seguradora
	 * @param valorMensal
	 */
	public Seguro(int id, Date dataInicio, Date dataFim, Seguradora seguradora,
			int valorMensal) {
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.seguradora = seguradora;
		this.listaSinistros = new ArrayList<Sinistro>();
		this.listaCondutores = new ArrayList<Condutor>();
		this.valorMensal = valorMensal;
	}

	//Getters & Setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the dataInicio
	 */
	public Date getDataInicio() {
		return dataInicio;
	}

	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	/**
	 * @return the dataFim
	 */
	public Date getDataFim() {
		return dataFim;
	}

	/**
	 * @param dataFim the dataFim to set
	 */
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
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
	 * @return the listaSinistros
	 */
	public ArrayList<Sinistro> getListaSinistros() {
		return listaSinistros;
	}

	/**
	 * @param listaSinistros the listaSinistros to set
	 */
	public void setListaSinistros(ArrayList<Sinistro> listaSinistros) {
		this.listaSinistros = listaSinistros;
	}

	/**
	 * @return the listaCondutores
	 */
	public ArrayList<Condutor> getListaCondutores() {
		return listaCondutores;
	}

	/**
	 * @param listaCondutores the listaCondutores to set
	 */
	public void setListaCondutores(ArrayList<Condutor> listaCondutores) {
		this.listaCondutores = listaCondutores;
	}

	/**
	 * @return the valorMensal
	 */
	public int getValorMensal() {
		return valorMensal;
	}

	/**
	 * @param valorMensal the valorMensal to set
	 */
	public void setValorMensal(int valorMensal) {
		this.valorMensal = valorMensal;
	}
	/**
	 * 
	 * @return the cliente
	 */
	public abstract Cliente getCliente();

	//Methods
	
	/**
	 * 
	 * @param condutor
	 * @return
	 */
	public boolean autorizarCondutor(Condutor condutor)
	{
		
		return listaCondutores.add(condutor);
	}
	/**
	 * 
	 * @param condutor
	 * @return
	 */
	public boolean desautorizarCondutor(Condutor condutor)
	{
		
		return listaCondutores.remove(condutor);
	}
	/**
	 * 
	 * @param condutor
	 * @return
	 */
	public abstract double calcularValor(Condutor condutor);
	/**
	 * 
	 * @param data
	 * @param endereco
	 * @param condutor
	 * @return generate a sinistro and return
	 */
	public Sinistro gerarSinistro(String data, String endereco, Condutor condutor)
	{
		return new Sinistro (data, endereco, seguradora, condutor);
	}

}
