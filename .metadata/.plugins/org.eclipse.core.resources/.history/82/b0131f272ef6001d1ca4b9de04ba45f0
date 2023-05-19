package Codes;

import java.util.ArrayList;
import java.util.Scanner;

public class funcoesListar {
	
	private static Scanner s = new Scanner(System.in);
	
	public static void listarClientePorSeguradora(ArrayList<Seguradora> listaSeguradoras)
	{
		System.out.println("Selecione a seguradora");
		
		for (int i = 0; i < listaSeguradoras.size(); i++)
		{
			System.out.println("(" + i + ")" + listaSeguradoras.get(i).getNome());
		}
		boolean erro = true;
		Seguradora seg = null;
		do {
			String seg_string = s.nextLine();
			try {
				seg = listaSeguradoras.get(Integer.parseInt(seg_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		for (Cliente cliente: seg.getListaClientes())
		{
			System.out.println(cliente.getNome());
		}
		
	}

	
	public static void listarSinistrosPorSeguradora(ArrayList<Seguradora> listaSeguradoras)
	{
		System.out.println("Selecione a seguradora");
		
		for (int i = 0; i < listaSeguradoras.size(); i++)
		{
			System.out.println("(" + i + ")" + listaSeguradoras.get(i).getNome());
		}
		boolean erro = true;
		Seguradora seg = null;
		do {
			String seg_string = s.nextLine();
			try {
				seg = listaSeguradoras.get(Integer.parseInt(seg_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		for (Sinistro sinistro: seg.getListaSinistros())
		{
			System.out.println(sinistro.getId()+ " do cliente " + sinistro.getCliente().getNome());
		}	
	}
	
	public static void listarSinistroPorCliente(ArrayList<Seguradora> listaSeguradoras)
	{
		System.out.println("Selecione a seguradora");
		
		for (int i = 0; i < listaSeguradoras.size(); i++)
		{
			System.out.println("(" + i + ")" + listaSeguradoras.get(i).getNome());
		}
		boolean erro = true;
		Seguradora seg = null;
		do {
			String seg_string = s.nextLine();
			try {
				seg = listaSeguradoras.get(Integer.parseInt(seg_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		System.out.println("Selecione o cliente");
		
		for (int i = 0; i < seg.getListaClientes().size(); i++)
		{
			System.out.println("(" + i + ")" + seg.getListaClientes().get(i).getNome());
		}
		erro = true;
		Cliente cliente = null;
		do {
			String cliente_string = s.nextLine();
			try {
				cliente = seg.getListaClientes().get(Integer.parseInt(cliente_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);	
		
		for (Sinistro sinistro: seg.getListaSinistros())
		{
			if (sinistro.getCliente() == cliente)
			{
				System.out.println(sinistro.getId());
			}
		}
	}
	
	public static void listarVeiculoPorCliente(ArrayList<Seguradora> listaSeguradoras)
	{
		System.out.println("Selecione a seguradora");
		
		for (int i = 0; i < listaSeguradoras.size(); i++)
		{
			System.out.println("(" + i + ")" + listaSeguradoras.get(i).getNome());
		}
		boolean erro = true;
		Seguradora seg = null;
		do {
			String seg_string = s.nextLine();
			try {
				seg = listaSeguradoras.get(Integer.parseInt(seg_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		System.out.println("Selecione o cliente");
		
		for (int i = 0; i < seg.getListaClientes().size(); i++)
		{
			System.out.println("(" + i + ")" + seg.getListaClientes().get(i).getNome());
		}
		erro = true;
		Cliente cliente = null;
		do {
			String cliente_string = s.nextLine();
			try {
				cliente = seg.getListaClientes().get(Integer.parseInt(cliente_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);	
		
		for (Veiculo veiculo: cliente.getListaVeiculos())
		{
			System.out.println(veiculo.getMarca()+" "+veiculo.getModelo()+" " +veiculo.getAnoFabricacao()+ " de placa " + veiculo.getPlaca());
		}
	}
	
	public static void listarVeiculoPorSeguradora(ArrayList<Seguradora> listaSeguradoras)
	{
		System.out.println("Selecione a seguradora");
		
		for (int i = 0; i < listaSeguradoras.size(); i++)
		{
			System.out.println("(" + i + ")" + listaSeguradoras.get(i).getNome());
		}
		boolean erro = true;
		Seguradora seg = null;
		do {
			String seg_string = s.nextLine();
			try {
				seg = listaSeguradoras.get(Integer.parseInt(seg_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		for (Cliente cliente: seg.getListaClientes())
		{
			for (Veiculo veiculo: cliente.getListaVeiculos())
			{
				System.out.println(veiculo.getMarca() + " " + veiculo.getModelo()+ " " + veiculo.getAnoFabricacao() + " de placa "
			+ veiculo.getPlaca());
			}
		}
		
	}
}
	
	
	
	
	
	
	
	
	
	