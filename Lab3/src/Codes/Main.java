package Codes;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Date dataLicenca = new Date(1682280000L);
		Date dataNascimento = new Date(919800000L);
		ClientePF clientepf = new ClientePF("Thiago Oliver Theo Baptista", "Rua Vinte e Oito", null, "321.998.094-55", "Masculino", 
				dataLicenca, "Graduação", dataNascimento, "A");
		
		Date dataFundacao = new Date(919108800L);
		ClientePJ clientepj  = new ClientePJ("Diego e Mário Corretores Associados ME", "Rua Alcir Marcansola", null, "47.900.847/0001-96", dataFundacao);
		
		if (clientepf.validarCPF())
		{
			System.out.println("O CPF do cliente eh valido!");
		} else
		{
			System.out.println("O CPF do cliente eh invalido!");
		}
		
		
		if (clientepj.validarCNPJ())
		{
			System.out.println("O CNPJ do cliente eh valido!");
		} else
		{
			System.out.println("O CNPJ do cliente eh invalido!");
		}
		
		Veiculo veiculopf = new Veiculo("HZO-8270", "CBT Jipe", "Javali 3.0 4x4 Diesel", 1988);
		Veiculo veiculopj = new Veiculo("MZT-3606", "Mitsubishi", "L200 GL 2.5 4X4 CD Diesel", 1999);
		clientepf.addVeiculo(veiculopf);
		clientepj.addVeiculo(veiculopj);
		
		Seguradora seg = new Seguradora("Seguradora 1", "3307-5524", "seguradora_1@unicamp.com.br", "Rua Janeiro Fevereiro Marco");
		
		seg.cadastrarCliente(clientepj);
		seg.cadastrarCliente(clientepf);
		
		Sinistro sinistro = new Sinistro(123, "14 de abril de 2023", "Rua dos domingos", seg, veiculopf, clientepf);
		seg.gerarSinistro(sinistro);

		System.out.println(seg.toString());
		System.out.println(clientepf.toString());
		System.out.println(clientepj.toString());
		System.out.println(veiculopf.toString());
		System.out.println(seg.toString());
		System.out.println(sinistro.toString());
		
		System.out.println(seg.listarClientes());
		seg.listarSinistros();
		seg.visualizarSinistro("Thiago Oliver Theo Baptista");
		
		menuTextual(seg);
		
	}
	
	public static void menuTextual (Seguradora seg)
	{	
		
		int opcao;
		Scanner s = new Scanner(System.in);
		
		do {
		    System.out.println("\nMENU\n1- Checar Nome\n2- Checar telefone\n3- Checar email\n4- Checar endereco\n5- Sair");
		    opcao = s.nextInt();

		    switch(opcao) {
		        case 1:
		            System.out.println("Nome: " + seg.getNome());
		            break;
		        case 2:
		            System.out.println("Telefone: " + seg.getTelefone());
		            break;
		        case 3:
		            System.out.println("Email: " + seg.getEmail());
		            break;
		        case 4:
		            System.out.println("Endereco: " + seg.getEndereco());
		            break;
		        case 5:
		            System.out.println("Saindo do menu.");
		            break;
		        default:
		            System.out.println("Opcao invalida.");
		            break;
		    }
		} while (opcao != 5);
		
		s.close();
	}

}
