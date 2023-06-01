package Codes;

import java.util.ArrayList;
import java.util.Date;

public class SeguroPF extends Seguro {

		private Veiculo veiculo;
		private ClientePF cliente;
		
		public SeguroPF(int id, Date dataInicio, Date dataFim, Seguradora seguradora,
				ArrayList<Sinistro> listaSinistros, ArrayList<Condutor> listaCondutores, int valorMensal,
				Veiculo veiculo, ClientePF cliente) {
			super(id, dataInicio, dataFim, seguradora, listaSinistros, listaCondutores, valorMensal);
			this.veiculo = veiculo;
			this.cliente = cliente;
		}
		public Veiculo getVeiculo() {
			return veiculo;
		}
		public void setVeiculo(Veiculo veiculo) {
			this.veiculo = veiculo;
		}
		public ClientePF getCliente() {
			return cliente;
		}
		public void setCliente(ClientePF cliente) {
			this.cliente = cliente;
		}
		@Override
		public double calcularValor(Condutor condutor) {
			
			int quantidadeSinistrosCondutor = 0;
			for (Sinistro sinistro: getListaSinistros())
			{
				if (sinistro.getCondutor() == condutor)
				{
					quantidadeSinistrosCondutor++;
				}
			}
			return CalcSeguro.VALOR_BASE.getConstante() * cliente.fatorIdade() * (1 + 1/(cliente.getListaVeiculos().size() + 2))
					* (2 + getListaSinistros().size()/10) *
					(5 + quantidadeSinistrosCondutor/10);
			
		}
		
		

		
		
}
