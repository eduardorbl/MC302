package Codes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class funcoesCadastrar {
	
	private static Scanner s = new Scanner(System.in);
	
	public static void cadastrarClientePF(ArrayList<Seguradora> listaSeguradoras)
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
		
		System.out.println("Digite o nome do cliente");
		
		String nome;
		do {
			nome = s.nextLine();
			
			if (Validacao.validarNome(nome))
			{
				break;
			}
			
			System.out.println("Nome invalido! Digite novamente");
		} while (true);
		
		System.out.println("Digite o endereco do cliente");
		String endereco = s.nextLine();
		
		System.out.println("Digite o CPF do cliente");
		final String cpf;
		String cpf_aux;
		do {
			cpf_aux = s.nextLine();
			
			if (Validacao.validarCPF(cpf_aux))
			{
				break;
			}
			
			System.out.println("CPF invalido! Digite novamente");
		} while (true);	
		cpf = cpf_aux;
		
		
		System.out.println("Digite o genero do cliente");
		String genero = s.nextLine();
		
		System.out.println("Digite a data da licenca do cliente (dd/mm/yyyy)");
		
		Date dataLicenca = null;
		boolean continua = true;
		while(continua)
		{	
			try {
				String data_string = s.nextLine();
				dataLicenca = new SimpleDateFormat("dd/MM/yyyy").parse(data_string);
				continua = false;
			} catch (ParseException e) {
				System.out.println("Digite novamente, formato incorreto");
				
			}
		}
		
		System.out.println("Digite o grau de educacao do cliente");
		String educacao = s.nextLine();
		
		System.out.println("Digite a data de nascimento do cliente (dd/mm/yyyy)");
	
		Date dataNascimento = null;
		boolean continua1 = true;
		while(continua1)
		{	
			try {
				String data_string1 = s.nextLine();
				dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data_string1);
				continua1 = false;
			} catch (ParseException e) {
				System.out.println("Digite novamente, formato incorreto");
				
			}
		}
		
		System.out.println("Digite a classe economica do cliente");
		String classeEconomica = s.nextLine();
		
		ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
		ClientePF cliente = new ClientePF(nome, endereco, listaVeiculos,
				cpf, genero, dataLicenca, educacao, dataNascimento, classeEconomica, 0);
				
		seg.cadastrarCliente(cliente);
		
	}
	
	public static void cadastrarClientePJ(ArrayList<Seguradora> listaSeguradoras)
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
		
		System.out.println("Digite o nome do cliente");
		
		String nome;
		do {
			nome = s.nextLine();
			
			if (Validacao.validarNome(nome))
			{
				break;
			}
			
			System.out.println("Nome invalido! Digite novamente");
		} while (true);
		
		
		System.out.println("Digite o endereco do cliente");
		String endereco = s.nextLine();
		
		System.out.println("Digite o CNPJ do cliente");
		final String cnpj;
		String cnpj_aux;
		do {
			cnpj_aux = s.nextLine();
			
			if (Validacao.validarCNPJ(cnpj_aux))
			{
				break;
			}
			
			System.out.println("CNPJ invalido! Digite novamente");
		} while (true);	
		cnpj = cnpj_aux;
		
		System.out.println("Digite a data de fundacao do cliente (dd/mm/yyyy)");
		Date dataFundacao = null;
		boolean continua = true;
		while(continua)
		{	
			try {
				String data_string = s.nextLine();
				dataFundacao = new SimpleDateFormat("dd/MM/yyyy").parse(data_string);
				continua = false;
			} catch (ParseException e) {
				System.out.println("Digite novamente, formato incorreto");
				
			}
		}
		

		
		System.out.println("Digite a quantidade de funcionarios do cliente");
		int qtdeFuncionarios = 0;
		continua = true;
		while(continua)
		{	
			String p= s.nextLine();
			
			try {
				qtdeFuncionarios = Integer.parseInt(p);
				if (qtdeFuncionarios > 0)
				{
					continua = false;
				} else
				{System.out.println("Numero invalido, digite novamente");}
			} catch (Exception e) {System.out.println("Numero invalido, digite novamente");};
				
		}
			
		ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
		ClientePJ cliente = new ClientePJ(nome, endereco, listaVeiculos, 
				cnpj, dataFundacao, qtdeFuncionarios, 0);
				
		seg.cadastrarCliente(cliente);
		
	}
	
	public static void cadastrarVeiculo (ArrayList<Seguradora> listaSeguradoras)
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
			System.out.println("("+i+")"+ seg.getListaClientes().get(i).getNome());
			
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
		
		System.out.println("Digite a placa do veiculo");
		String placa = s.nextLine();
		
		System.out.println("Digite a marca do veiculo");
		String marca = s.nextLine();
		
		System.out.println("Digite o modelo do veiculo");
		String modelo = s.nextLine();
		
		System.out.println("Digite o ano de fabricacao");
		int anoFabricacao = 0;
		boolean continua = true;
		while(continua)
		{	
			String p = s.nextLine();
			
			try {
				anoFabricacao = Integer.parseInt(p);
				if (anoFabricacao > 0)
				{
					continua = false;
				} else
				{System.out.println("Numero invalido, digite novamente");}
			} catch (Exception e) {System.out.println("Numero invalido, digite novamente");};
				
		}
		
		Veiculo veiculo = new Veiculo(placa, marca, modelo, anoFabricacao);
		cliente.addVeiculo(veiculo);
	

	}
	
	public static void cadastrarSeguradora(ArrayList<Seguradora> listaSeguradoras)
	{

		System.out.println("Digite o nome da seguradora");
		String nome = s.nextLine();
		
		System.out.println("Digite o telefone da seguradora");
		String telefone = s.nextLine();
		
		System.out.println("Digite o email da seguradora");
		String email = s.nextLine();
		
		System.out.println("Digite o endereco da seguradora");
		String endereco = s.nextLine();

		Seguradora seg = new Seguradora(nome, telefone, email, endereco);
		
		listaSeguradoras.add(seg);
	}
	
}
