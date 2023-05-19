package Codes;

import java.util.ArrayList;
import java.util.Scanner;

import Codes.MenuOperacoes.Cadastrar.tipoCliente;

public class Menu {
	
	private static Scanner s = new Scanner(System.in);
	private static ArrayList<Seguradora> listaSeguradoras = new ArrayList<>();
	public static void iniciarMenuOperacao(ArrayList<Seguradora> l)
	{	
		MenuOperacoes op;
		listaSeguradoras = l;
		
		do {
			MenuOperacoesString.printarMenu();
			String op_string = s.nextLine();
			try {
				op = MenuOperacoes.fromInt(Integer.parseInt(op_string));
			} catch(Exception e) {
				
				op = MenuOperacoes.ERRO;
			}
			
			if (op == null)
			{
				op = MenuOperacoes.ERRO;
			}
			switch (op) {
			
				case CADASTRAR: 
					iniciarMenuCadastro();
					break;
				case LISTAR:
					iniciarMenuLista();
					break;
				case EXCLUIR:
					iniciarMenuExcluir();
					break;
				case GERARSINISTRO:
					gerarSinistro();
					
					break;
				case TRANSFERIRSEGURO:
					transferirSeguro();
					break;
				case CALCULARRECEITASEGURADORA:
					calcularReceita();
					break;
				case SAIR:
					System.out.println("Saindo...");
					break;
				case ERRO:
					System.out.println("Digite um numero que se enquadre nas opcoes. " + op_string
							+ " nao se enquadra!");
					
					break;
				}
			
		} while (op != MenuOperacoes.SAIR);
		
	}
	
	private static void gerarSinistro() {
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
		
		System.out.println("Digite o id");
		int id = 0;
		do {
			String id_string = s.nextLine();
			try {
				id = Integer.parseInt(id_string);
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);	
		
		System.out.println("Digite a data do sinistro (dd/mm/yyyy)");
		String data = s.nextLine();
		
		System.out.println("Digite o endereco");
		String endereco = s.nextLine();
		
		Sinistro sinistro = new Sinistro(id, data, endereco, seg, veiculo,cliente);
		seg.gerarSinistro(sinistro);
	}

	public static void iniciarMenuCadastro()
	{	
		MenuOperacoes.Cadastrar op;
		do {
			MenuOperacoesString.Cadastrar.printarCadastrar();
			String op_string = s.nextLine();
			try {
				op = MenuOperacoes.Cadastrar.fromInt(Integer.parseInt(op_string));
			} catch(Exception e) {
				
				op = MenuOperacoes.Cadastrar.ERRO;
			}
			
			if (op == null)
			{
				op = MenuOperacoes.Cadastrar.ERRO;
			}
			switch (op) {
			
				case CLIENTE:
					cadastrarCliente();
					break;
				case VEICULO:
					funcoesCadastrar.cadastrarVeiculo(listaSeguradoras);
					break;
				case SEGURADORA:
					funcoesCadastrar.cadastrarSeguradora(listaSeguradoras);
					break;
				case VOLTAR:
					System.out.println("Voltando...");
					break;
				case ERRO:
					System.out.println("Digite um numero que se enquadre nas opcoes. " + op_string
							+ " nao se enquadra!");
					break;
				}
			
		} while (op != MenuOperacoes.Cadastrar.VOLTAR);
	}
	
	public static void cadastrarCliente()
	{
		tipoCliente tipo;
		
		do
		{	
			MenuOperacoesString.Cadastrar.tipoCliente.printarTipo();
			String tipo_string = s.nextLine();
			try
			{
				tipo = MenuOperacoes.Cadastrar.tipoCliente.fromInt(Integer.parseInt(tipo_string));
			
			} catch (Exception e)
			{
				tipo = MenuOperacoes.Cadastrar.tipoCliente.ERRO;
			}
			
			if (tipo == null)
			{
				tipo = MenuOperacoes.Cadastrar.tipoCliente.ERRO;
			}
			
			switch (tipo) {
			case PF: 
				funcoesCadastrar.cadastrarClientePF(listaSeguradoras);
				break;
			case PJ:
				funcoesCadastrar.cadastrarClientePJ(listaSeguradoras);
				break;
			case VOLTAR:
				break;
				
			case ERRO:
				System.out.println("Digite um numero que se enquadre nas opcoes. " + tipo_string
						+ " nao se enquadra!");
				break;
			}
		} while (tipo != MenuOperacoes.Cadastrar.tipoCliente.VOLTAR);	
	}
	
	public static void iniciarMenuLista()
	{	
		MenuOperacoes.Listar op;
		
		do {
			MenuOperacoesString.Listar.printarListar();
			String op_string = s.nextLine();
			try {
				op = MenuOperacoes.Listar.fromInt(Integer.parseInt(op_string));
			} catch(Exception e) {
				
				op = MenuOperacoes.Listar.ERRO;
			}		
			
			if (op == null)
			{
				op = MenuOperacoes.Listar.ERRO;
			}
			switch (op) {
			
				case CLIENTEPORSEG: 
					funcoesListar.listarClientePorSeguradora(listaSeguradoras);
					break;
				case SINISTROSPORSEG:
					funcoesListar.listarSinistrosPorSeguradora(listaSeguradoras);
					break;
				case SINISTROPORCLIENTE:
					funcoesListar.listarSinistroPorCliente(listaSeguradoras);
					break;
				case VEICULOPORCLIENTE:
					funcoesListar.listarVeiculoPorCliente(listaSeguradoras);
					break;
				case VEICULOPORSEGURADORA:
					funcoesListar.listarVeiculoPorSeguradora(listaSeguradoras);
					break;
				case VOLTAR:
					System.out.println("Voltando...");
					break;
				case ERRO:
					System.out.println("Digite um numero que se enquadre nas opcoes. " + op_string
							+ " nao se enquadra!");
					break;
				}
			
		} while (op != MenuOperacoes.Listar.VOLTAR);
	}
	
	public static void iniciarMenuExcluir()
	{
		MenuOperacoes.Excluir op;
		
		do {	
			MenuOperacoesString.Excluir.printarExcluir();
			String op_string = s.nextLine();
			try {
				op = MenuOperacoes.Excluir.fromInt(Integer.parseInt(op_string));
			} catch(Exception e) {
				
				op = MenuOperacoes.Excluir.ERRO;
			}		
			
			if (op == null)
			{
				op = MenuOperacoes.Excluir.ERRO;
			}
			switch (op) {
			
				case CLIENTE: 
					funcoesExcluir.excluirCliente(listaSeguradoras);
					break;
				case VEICULO:
					funcoesExcluir.excluirVeiculo(listaSeguradoras);		
					break;
				case SINISTRO:
					funcoesExcluir.excluirSinstro(listaSeguradoras);
					break;
				case VOLTAR:
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Digite um numero que se enquadre nas opcoes. " + op_string
							+ " nao se enquadra!");
					break;
				}
			
		} while (op != MenuOperacoes.Excluir.VOLTAR);	
	}
	
	public static void transferirSeguro()
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
		
		System.out.println("Selecione o cliente que passara o seguro");
		
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
		
		System.out.println("Selecione o cliente que recebera o seguro");
		
		for (int i = 0; i < seg.getListaClientes().size(); i++)
		{
			System.out.println("(" + i + ")" + seg.getListaClientes().get(i).getNome());
		}
		erro = true;
		Cliente cliente1 = null;
		do {
			String cliente_string = s.nextLine();
			try {
				cliente1 = seg.getListaClientes().get(Integer.parseInt(cliente_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		for (Veiculo v: cliente.getListaVeiculos())
		{
			cliente1.addVeiculo(v);
		}
		
		cliente.setListaVeiculos(null);
		
	}
	public static void calcularReceita()
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
		System.out.println(seg.calcularReceita());
	}
}
