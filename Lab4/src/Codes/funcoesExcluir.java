package Codes;

import java.util.ArrayList;
import java.util.Scanner;

public class funcoesExcluir {
	
	private static Scanner s = new Scanner(System.in);
	
	public static void excluirCliente(ArrayList<Seguradora> listaSeguradoras)

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
		
		seg.removerCliente(cliente);
	}
	
	public static void excluirVeiculo(ArrayList<Seguradora> listaSeguradoras)
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
		
		System.out.println("Selecione o veiculo");
		
		for (int i = 0; i < cliente.getListaVeiculos().size(); i++)
		{
			System.out.println("(" + i + ")" + cliente.getListaVeiculos().get(i).toString());
		}
		erro = true;
		Veiculo veiculo = null;
		do {
			String veiculo_string = s.nextLine();
			try {
				veiculo = cliente.getListaVeiculos().get(Integer.parseInt(veiculo_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		cliente.excluirVeiculo(veiculo);
	
	}
	
	public static void excluirSinstro(ArrayList<Seguradora> listaSeguradoras)
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
		
		System.out.println("Selecione o sinistro");
		
		for (int i = 0; i < seg.getListaSinistros().size(); i++)
		{
			System.out.println("(" + i + ")" + seg.getListaSinistros().get(i).getId());
		}
		erro = true;
		Sinistro sinistro = null;
		do {
			String sinistro_string = s.nextLine();
			try {
				sinistro = seg.getListaSinistros().get(Integer.parseInt(sinistro_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		seg.removerSinistro(sinistro);
	
	}
	
}

	