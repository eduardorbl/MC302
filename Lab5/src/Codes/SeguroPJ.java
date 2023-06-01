package Codes;

import java.util.ArrayList;
import java.util.Date;

public class SeguroPJ extends Seguro {
	
	private Frota frota;
	private ClientePJ cliente;
	
	public SeguroPJ(int id, Date dataInicio, Date dataFim, Seguradora seguradora, ArrayList<Sinistro> listaSinistros,
			ArrayList<Condutor> listaCondutores, int valorMensal, Frota frota, ClientePJ cliente) {
		super(id, dataInicio, dataFim, seguradora, listaSinistros, listaCondutores, valorMensal);
		this.frota = frota;
		this.cliente = cliente;
	}

	public Frota getFrota() {
		return frota;
	}

	public void setFrota(Frota frota) {
		this.frota = frota;
	}

	public ClientePJ getCliente() {
		return cliente;
	}

	public void setCliente(ClientePJ cliente) {
		this.cliente = cliente;
	}

	@Override
	public double calcularValor(Condutor condutor) {
		
		int qtdSinistros = 0;
		for (Sinistro sinistro: getListaSinistros())
		{
			if (sinistro.getCondutor() == condutor)
			{
				qtdSinistros++;
			}
		}
		return CalcSeguro.VALOR_BASE.getConstante() * (10 + (cliente.getQuantidadeFunc()/10)) *
				(1 + 1/(frota.quantidadeVeiculos() + 2)) *
				(1 + 1/(cliente.anosPosFundacao() + 2)) *
				(2 + getListaSinistros().size()/10) *
				(5 + qtdSinistros/10);
				
		
	}

	
	
}
