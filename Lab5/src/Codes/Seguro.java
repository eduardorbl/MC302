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
	private double valorMensal;
	private static ArrayList<Integer> listaID;
	
	/**
	 * Constructor
	 * @param id
	 * @param dataInicio
	 * @param dataFim
	 * @param seguradora
	 */
	public Seguro(Date dataInicio, Date dataFim, Seguradora seguradora) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.seguradora = seguradora;
		this.listaSinistros = new ArrayList<Sinistro>();
		this.listaCondutores = new ArrayList<Condutor>();
		this.valorMensal = calculaValorSeguro();
		
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
	public double getValorMensal() {
		this.valorMensal = calculaValorSeguro();
		return valorMensal;
	}

	/**
	 * @param valorMensal the valorMensal to set
	 */
	public void atualizaValorMensal() 
	{
		this.valorMensal = calculaValorSeguro();
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
	public boolean gerarSinistro(Sinistro sinistro)
	{
		return listaSinistros.add(sinistro);
	}
	public boolean excluirSinistro(Sinistro sinistro)
	{
		return listaSinistros.remove(sinistro);
	}
	public boolean excluirCondutor (Condutor condutor)
	{
		return listaCondutores.remove(condutor);
	}
	/**
	 * 
	 * @return total value of seguro
	 */
	public abstract double calculaValorSeguro();

}
