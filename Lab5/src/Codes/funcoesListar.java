package Codes;

import java.util.ArrayList;

public class funcoesListar {
	
	public static void listarClientePorSeguradora(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		for (Cliente cliente: seguradora.getListaClientes())
		{
			System.out.println(cliente.getNome());
		}
		
	}
	
	public static void listarSinistroPorCliente(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if(seguradora == null) return;
		Cliente cliente = Scan.Selecione("um cliente", seguradora.getListaClientes());
		if (cliente == null) return;
		
		ArrayList<Sinistro> lista = seguradora.getSinistrosPorCliente(cliente);
	
		for (Sinistro sinistro: lista)
		{
			System.out.println(sinistro.getId() + " do condutor " + sinistro.getCondutor().getNome());
		}
	}
	
	public static void listarVeiculoPorCliente(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		Cliente cliente = Scan.Selecione("um cliente", seguradora.getListaClientes());
		if (cliente == null) return;
		
		if (cliente instanceof ClientePF)
		{
			ClientePF c = (ClientePF)cliente;
			for (Veiculo veiculo: c.getListaVeiculos())
			{
				System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getAnoFabricacao());
			}
		} else
		{
			ClientePJ c = (ClientePJ)cliente;
			for (Frota frota: c.getListaFrota())
			{
				for (Veiculo veiculo: frota.getListaVeiculos())
				{
					System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getAnoFabricacao());
				}
			}
		}
	}
	
	public static void listarCondutorPorSeguro(ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null ) return;
		
		Seguro seguro = Scan.Selecione("um seguro", seguradora.getListaSeguros());
		if (seguro == null) return;
		
		for (Condutor condutor: seguro.getListaCondutores())
		{
			System.out.println(condutor.getNome());
		}
		
	}
	
	public static void listarSeguroPorSeguradora (ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		for (Seguro seguro: seguradora.getListaSeguros())
		{
			System.out.println(seguro.getId() + " do cliente " + seguro.getCliente().getNome());
		}
		if (seguradora.getListaSeguros().size() == 0)
		{
			System.out.println("Nao ha seguros cadastrados.");
		}
	}
	

}
	
	
	
	
	
	
	
	
	
	