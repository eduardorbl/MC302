package Codes;

import java.util.ArrayList;
import java.util.Date;

public class funcoesCadastrar {
	
	public static void cadastrarClientePF(ArrayList<Seguradora> listaSeguradoras)
	{	
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if(seguradora == null)
		{
			return;
		}
	
		//recebe nome e so segue quando for valido
		boolean nome_invalido = true;
		String nome;
		do 
		{
			nome = Scan.lerString("o nome", "do cliente");
			
			if (Validacao.validarNome(nome))
			{
				nome_invalido = false;
			} else
			{
				System.out.println("Nome invalido. Digite novamente.");
			}
		
		} while (nome_invalido);
		
		//recebe telefone e so segue quando for valido
		boolean telefone_invalido = true;
		String telefone;
		do 
		{
			telefone = Scan.lerString("o telefone", "do cliente");	
			if (Validacao.validarTelefone(telefone))
			{
				telefone_invalido = false;
			} else
			{
				System.out.println("Telefone invalido. Digite novamente.");
			}
		} while (telefone_invalido);
		
		//recebe endereco
		String endereco = Scan.lerString("o endereco", "do cliente");
		//recebe email
		String email = Scan.lerString("o email", "do cliente");
		
		// recebe cpf e so segue quando for valido
		boolean cpf_invalido = true;
		String cpf;
		do 
		{
			cpf = Scan.lerString("o CPF", "do cliente");
			
			if (Validacao.validarCPF(cpf))
			{
				cpf_invalido = false;
			} else
			{
				System.out.println("CPF invalido. Digite novamente.");
			}
		} while (cpf_invalido);
		
		
		String genero = Scan.lerString("o genero", "do cliente");
		if (genero == null) return;
		String educacao = Scan.lerString("a educacao", "do cliente");
		if(educacao==null) return;
		Date dataNascimento = Scan.lerData("nascimento","do cliente");
		if (dataNascimento == null) return;

		ClientePF cliente = new ClientePF(nome, telefone, endereco, email, 0, cpf, genero, educacao, dataNascimento);
		
		seguradora.cadastrarCliente(cliente);
	}
	
	public static void cadastrarClientePJ(ArrayList<Seguradora> listaSeguradoras)
	{	
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		// recebe cnpj e so segue quando for valido
		boolean cnpj_invalido = true;
		String cnpj;
		do 
		{
			cnpj = Scan.lerString("o CNPJ", "do cliente");
			
			if (Validacao.validarCNPJ(cnpj))
			{
				cnpj_invalido = false;
			} else
			{
				System.out.println("CNPJ invalido. Digite novamente:");
			}
		
		}while (cnpj_invalido);
		
		//recebe nome e so segue quando for valido
		boolean nome_invalido = true;
		String nome;
		do 
		{
			nome = Scan.lerString("o nome", "do cliente");
			
			if (Validacao.validarNome(nome))
			{
				nome_invalido = false;
			} else
			{
				System.out.println("Nome invalido. Digite novamente:");
			}
		
		}while (nome_invalido);
		
		//recebe telefone e so segue quando for valido
		boolean telefone_invalido = true;
		String telefone;
		do 
		{
			telefone = Scan.lerString("o telefone", "da seguradora");
			
			if (Validacao.validarTelefone(telefone))
			{
				telefone_invalido = false;
			} else
			{
				System.out.println("Telefone invalido. Digite novamente:");
			}
		
		} while (telefone_invalido);
		
		//recebe endereco
		String endereco = Scan.lerString("o endereco", "da seguradora");
		
		//recebe email
		String email = Scan.lerString("o email", "da seguradora");
		
		//recebe data de fundacao
		Date dataFundacao = Scan.lerData("fundacao", "do cliente");
		
		//recebe numero de funcionarios
		int qtdeFuncionarios = Scan.lerInteiro("funcionarios", "do cliente");
		
				
		ClientePJ cliente = new ClientePJ(nome, telefone, endereco, email, 0, cnpj, 
				dataFundacao, qtdeFuncionarios);
		
		seguradora.cadastrarCliente(cliente);
		
	}
	
	public static void cadastrarVeiculo (ArrayList<Seguradora> listaSeguradoras)
	{		
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora==null) return;
		
		Cliente cliente = Scan.Selecione("um cliente", seguradora.getListaClientes());
		if(cliente == null) return;
		
		String placa = Scan.lerString("a placa", "do veiculo");
		String marca = Scan.lerString("a marca", "do veiculo");
		String modelo = Scan.lerString("o modelo", "do veiculo");
		int anoFabricacao = Scan.lerInteiro("anos apos a fabricacao", "do veiculo");

		Veiculo veiculo = new Veiculo(placa, marca, modelo, anoFabricacao);
		
		if (cliente instanceof ClientePJ)
		{
			//downcasting
			ClientePJ c = (ClientePJ) cliente;
			
			//seleciona a frota
			Frota frota = Scan.Selecione("uma frota", c.getListaFrota());
			if (frota == null) return;
			c.atualizarFrota(true, frota, veiculo);
		} else
		{
			//downcasting 
			ClientePF c = (ClientePF) cliente;
			//cadastra veiculo
			c.cadastrarVeiculo(veiculo);
		}
	

	}
	
	public static void cadastrarSeguradora(ArrayList<Seguradora> listaSeguradoras)
	{
		// recebe cnpj e so segue quando for valido
		boolean cnpj_invalido = true;
		String cnpj;
		do 
		{
			cnpj = Scan.lerString("o CNPJ", "da seguradora");
			
			if (Validacao.validarCNPJ(cnpj))
			{
				cnpj_invalido = false;
			} else
			{
				System.out.println("CNPJ invalido. Digite novamente:");
			}
		
		}while (cnpj_invalido);
		
		//recebe nome e so segue quando for valido
		boolean nome_invalido = true;
		String nome;
		do 
		{
			nome = Scan.lerString("o nome", "da seguradora");
			
			if (Validacao.validarNome(nome))
			{
				nome_invalido = false;
			} else
			{
				System.out.println("Nome invalido. Digite novamente:");
			}
		
		}while (nome_invalido);
		
		//recebe telefone e so segue quando for valido
		boolean telefone_invalido = true;
		String telefone;
		do 
		{
			telefone = Scan.lerString("o telefone", "da seguradora");
			
			if (Validacao.validarTelefone(telefone))
			{
				telefone_invalido = false;
			} else
			{
				System.out.println("Telefone invalido. Digite novamente:");
			}
		
		} while (telefone_invalido);
		
		//recebe endereco
		String endereco = Scan.lerString("o endereco", "da seguradora");
		
		//recebe email
		String email = Scan.lerString("o email", "da seguradora");
		
		Seguradora seguradora = new Seguradora(cnpj, nome, telefone, endereco, email);
		
		listaSeguradoras.add(seguradora);
		
	}
	
	public static void cadastrarCondutor (ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		
		Seguro seguro = Scan.Selecione("um seguro", seguradora.getListaSeguros());
		if (seguro == null) return;
		
		//recebe nome e so segue quando for valido
			boolean nome_invalido = true;
			String nome;
			do 
			{
				nome = Scan.lerString("o nome", "do condutor");
					
				
				
				if (Validacao.validarNome(nome))
				{
					nome_invalido = false;
				} else
				{
					System.out.println("Nome invalido. Digite novamente.");
				}
			
			} while (nome_invalido);
			
			//recebe telefone e so segue quando for valido
			boolean telefone_invalido = true;
			String telefone;
			do 
			{
				telefone = Scan.lerString("o telefone", "do condutor");	
				if (Validacao.validarTelefone(telefone))
				{
					telefone_invalido = false;
				} else
				{
					System.out.println("Telefone invalido. Digite novamente.");
				}
			} while (telefone_invalido);
			
			//recebe endereco
			String endereco = Scan.lerString("o endereco", "do condutor");
			//recebe email
			String email = Scan.lerString("o email", "do condutor");
			
			// recebe cpf e so segue quando for valido
			boolean cpf_invalido = true;
			String cpf;
			do 
			{
				cpf = Scan.lerString("o CPF", "do condutor");
				
				if (Validacao.validarCPF(cpf))
				{
					cpf_invalido = false;
				} else
				{
					System.out.println("CPF invalido. Digite novamente.");
				}
			} while (cpf_invalido);
			
			Date dataNascimento = Scan.lerData("nascimento","do condutor");
			
			Condutor condutor = new Condutor(cpf, nome, telefone, endereco, email, dataNascimento);
			
			seguro.autorizarCondutor(condutor);
					
	}
	
	public static void cadastroFrota (ArrayList<Seguradora> listaSeguradoras)
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
		
		String codigo = Scan.lerString("o codigo", "da frota");
		Frota frota = new Frota(codigo);
		
		cliente.cadastrarFrota(frota);
		
	}
	
	public static void cadastroSinistro (ArrayList<Seguradora> listaSeguradoras)
	{
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
		Seguro seguro = Scan.Selecione("um seguro", seguradora.getListaSeguros());
		if (seguro == null) return;
		Condutor condutor = Scan.Selecione("um condutor", seguro.getListaCondutores());
		if (condutor == null) return;
		
		Date data = Scan.lerData("inicio", "do sinistro");
		String endereco = Scan.lerString("o endereco", "do sinistro");
		
		Sinistro sinistro = new Sinistro(data, endereco, seguradora, condutor);
		
		seguro.gerarSinistro(sinistro);
		condutor.adcionarSinistro(sinistro);
		
	}
	
	public static void cadastroSegPJ (ArrayList<Seguradora> listaSeguradoras)
	{	
		Date dataInicio = Scan.lerData("inicio", "do seguro");
		Date dataFim = Scan.lerData("fim", "do seguro");
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
		
		SeguroPJ seguro = new SeguroPJ(dataInicio, dataFim, seguradora, frota, cliente);
		seguradora.gerarSeguro(seguro);

	}
	
	public static void cadastroSegPF (ArrayList<Seguradora> listaSeguradoras)
	{
		Date dataInicio = Scan.lerData("inicio", "do seguro");
		Date dataFim = Scan.lerData("fim", "do seguro");
		Seguradora seguradora = Scan.Selecione("uma seguradora", listaSeguradoras);
		if (seguradora == null) return;
				
		ArrayList<ClientePF> lista = new ArrayList<ClientePF>();
		for (Cliente cliente: seguradora.getListaClientes())
		{
			if (cliente instanceof ClientePF)
			{
				ClientePF c = (ClientePF)cliente;
				lista.add(c);
			}
		}
		
		ClientePF cliente = Scan.Selecione("um cliente", lista);
		if (cliente == null) return;
		Veiculo veiculo = Scan.Selecione("um veiculo", cliente.getListaVeiculos());
		if (veiculo == null) return;
		
		SeguroPF seguro = new SeguroPF(dataInicio, dataFim, seguradora, veiculo, cliente);
		seguradora.gerarSeguro(seguro);
	}
}
