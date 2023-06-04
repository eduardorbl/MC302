package Codes;

import java.util.ArrayList;
import java.util.Date;

public class SeguroPF extends Seguro {

		private Veiculo veiculo;
		private ClientePF cliente;
		
		//Constructor
		
		/**
		 * 
		 * @param id
		 * @param dataInicio
		 * @param dataFim
		 * @param seguradora
		 * @param listaSinistros
		 * @param listaCondutores
		 * @param valorMensal
		 * @param veiculo
		 * @param cliente
		 */
		public SeguroPF(int id, Date dataInicio, Date dataFim, Seguradora seguradora,
				ArrayList<Sinistro> listaSinistros, ArrayList<Condutor> listaCondutores, int valorMensal,
				Veiculo veiculo, ClientePF cliente) {
			super(id, dataInicio, dataFim, seguradora);
			this.veiculo = veiculo;
			this.cliente = cliente;
		}

		//Getters & Setters
		
		/**
		 * @return the veiculo
		 */
		public Veiculo getVeiculo() {
			return veiculo;
		}

		/**
		 * @param veiculo the veiculo to set
		 */
		public void setVeiculo(Veiculo veiculo) {
			this.veiculo = veiculo;
		}

		/**
		 * @return the cliente
		 */
		public ClientePF getCliente() {
			return cliente;
		}

		/**
		 * @param cliente the cliente to set
		 */
		public void setCliente(ClientePF cliente) {
			this.cliente = cliente;
		}
		
		//Methods
		
		@Override
		/**
		 * @param condutor
		 * @return value of seguro per condutor
		 */
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

		@Override
		/**
		 * @return value of seguro total
		 */
		public double calculaValorSeguro() 
		{
			double valor = 0;
			
			for (Condutor condutor: getListaCondutores())
			{
				valor += calcularValor(condutor);
			}
			return valor;
		}
		
		
		
}
