package Codes;

import java.util.ArrayList;
import java.util.Date;

public class AppMain {
	
	public static void main(String[] args) {
		
		Date dataLicenca = new Date(1682280000L);
		Date dataNascimento = new Date(919800000L);
		ClientePF clientepf = new ClientePF("Thiago Oliver Theo Baptista", "Rua Vinte e Oito", null, "321.998.094-55", "Masculino", 
				dataLicenca, "Graduação", dataNascimento, "A", 0);
		
		Date dataFundacao = new Date(919108800L);
		ClientePJ clientepj  = new ClientePJ("Diego e Mário Corretores Associados ME", "Rua Alcir Marcansola", null, "47.900.847/0001-96", dataFundacao, 0, 0);

		
		Veiculo veiculopf = new Veiculo("HZO-8270", "CBT Jipe", "Javali 3.0 4x4 Diesel", 1988);
		Veiculo veiculopj = new Veiculo("MZT-3606", "Mitsubishi", "L200 GL 2.5 4X4 CD Diesel", 1999);
		clientepf.addVeiculo(veiculopf);
		clientepj.addVeiculo(veiculopj);
		
		Seguradora seg = new Seguradora("Seguradora 1", "3307-5524", "seguradora_1@unicamp.com.br", "Rua Janeiro Fevereiro Marco");
		
		seg.cadastrarCliente(clientepj);
		seg.cadastrarCliente(clientepf);
		
		Sinistro sinistro = new Sinistro(123, "14 de abril de 2023", "Rua dos domingos", seg, veiculopf, clientepf);
		seg.gerarSinistro(sinistro);
		ArrayList<Seguradora> listaSeguradoras = new ArrayList<>();
		listaSeguradoras.add(seg);
		
		Menu.iniciarMenuOperacao(listaSeguradoras);
	}

}
