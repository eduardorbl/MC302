package Codes;

import java.util.ArrayList;
import java.util.Scanner;
import Codes.MenuOperacoes.Cadastrar.tipoCliente;
import Codes.MenuOperacoes.Cadastrar.tipoSeguro;

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
					funcoesCadastrar.cadastroSinistro(listaSeguradoras);
				case CALCULARRECEITASEGURADORA:
					Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
					System.out.println("Receita:" + seguradora.calcularReceita()+"R$");
					break;
				case SAIR:
					System.out.println("Saindo...");
					break;
				case ERRO:
					System.out.println("Digite um numero que se enquadre nas opcoes. " + op_string
							+ " nao se enquadra!");					
					break;
			default:
				break;
				}
			
		} while (op != MenuOperacoes.SAIR);
		
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
				case CONDUTOR:
					funcoesCadastrar.cadastrarCondutor(listaSeguradoras);
					break;
				case FROTA:
					funcoesCadastrar.cadastroFrota(listaSeguradoras);
					break;
				case SEGURO:
					cadastrarSeguro();
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
	
	public static void cadastrarSeguro()
	{
		tipoSeguro tipo;
		
		do
		{	
			MenuOperacoesString.Cadastrar.tipoSeguro.printarTipo();
			String tipo_string = s.nextLine();
			try
			{
				tipo = MenuOperacoes.Cadastrar.tipoSeguro.fromInt(Integer.parseInt(tipo_string));
			
			} catch (Exception e)
			{
				tipo = MenuOperacoes.Cadastrar.tipoSeguro.ERRO;
			}
			
			if (tipo == null)
			{
				tipo = MenuOperacoes.Cadastrar.tipoSeguro.ERRO;
			}
			
			switch (tipo) {
			case PF: 
				funcoesCadastrar.cadastroSegPF(listaSeguradoras);
				break;
			case PJ:
				funcoesCadastrar.cadastroSegPJ(listaSeguradoras);
				break;
			case VOLTAR:
				break;
				
			case ERRO:
				System.out.println("Digite um numero que se enquadre nas opcoes. " + tipo_string
						+ " nao se enquadra!");
				break;
			}
		} while (tipo != MenuOperacoes.Cadastrar.tipoSeguro.VOLTAR);	
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
				case SINISTROPORCLIENTE:
					funcoesListar.listarSinistroPorCliente(listaSeguradoras);
					break;
				case VEICULOPORCLIENTE:
					funcoesListar.listarVeiculoPorCliente(listaSeguradoras);
					break;
				case CONDUTORPORSEGURADORA:
					funcoesListar.listarCondutorPorSeguro(listaSeguradoras);
					break;
				case SEGUROPORSEGURADORA:
					funcoesListar.listarSeguroPorSeguradora(listaSeguradoras);
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
				case SEGURADORA:
					funcoesExcluir.excluirSeguradora(listaSeguradoras);
					break;
				case FROTA:
					funcoesExcluir.excluirFrota(listaSeguradoras);
					break;
				case CONDUTOR:
					funcoesExcluir.excluirCondutor(listaSeguradoras);
					break;
				case SEGURO:
					funcoesExcluir.excluirSeguro(listaSeguradoras);
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
	

}
