package Codes;

import java.util.ArrayList;

public class funcoesExcluir {
	
	public static void excluirCliente(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		Cliente cliente = Scan.Selecione("um cliente", seguradora.getListaClientes());
		if (cliente == null) return;
		
		seguradora.removerCliente(cliente);
				
	}
	
	public static void excluirVeiculo(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;

		Cliente cliente = Scan.Selecione("um cliente", seguradora.getListaClientes());
		if (cliente == null) return;
		
		if (cliente instanceof ClientePF)
		{	
			ClientePF c = (ClientePF)cliente;
			Veiculo veiculo = Scan.Selecione("um veiculo", c.getListaVeiculos());
			c.removerVeiculo(veiculo);
		} else
		{
			ClientePJ c = (ClientePJ)cliente;
			Frota frota = Scan.Selecione("uma frota", c.getListaFrota());
			Veiculo veiculo = Scan.Selecione("um veiculo", frota.getListaVeiculos());
			c.atualizarFrota(false, frota, veiculo);
		}

	}
	
	public static void excluirSinstro(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		Seguro seguro = Scan.Selecione("um sinistro", seguradora.getListaSeguros());
		if (seguro == null) return;
		
		Sinistro sinistro = Scan.Selecione("um sinistro", seguro.getListaSinistros());
		if (sinistro == null) return;
		
		seguro.excluirSinistro(sinistro);
	}
	
	public static void excluirSeguradora(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		listaSeguradoras.remove(seguradora);
	}
	
	public static void excluirFrota (ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		ArrayList<ClientePJ> lista = new ArrayList<ClientePJ>();
		for (Cliente cliente: seguradora.getListaClientes())
		{
			if (cliente instanceof ClientePJ)
			{
				ClientePJ c = (ClientePJ)cliente;
				lista.add(c);
			}
		}
		
		ClientePJ cliente = Scan.Selecione("um cliente", lista);
		if (cliente == null) return;
		Frota frota = Scan.Selecione("uma frota", cliente.getListaFrota());
		if (frota == null) return;
		
		cliente.excluirFrota(frota);
	}
	
	public static void excluirCondutor (ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		Seguro seguro = Scan.Selecione("um sinistro", seguradora.getListaSeguros());
		if (seguro == null) return;
		Condutor condutor = Scan.Selecione("um condutor", seguro.getListaCondutores());
		if (condutor == null) return;
		
		seguro.excluirCondutor(condutor);
		
	}
	
	public static void excluirSeguro (ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		Seguro seguro = Scan.Selecione("um sinistro", seguradora.getListaSeguros());
		if (seguro == null) return;
		
		seguradora.excluirSeguro(seguro);
		
	}
	
}

	