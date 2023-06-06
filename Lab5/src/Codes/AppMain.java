package Codes;

import java.util.ArrayList;
import java.util.Date;
public class AppMain {
	
	public static void main(String[] args) {
		
		ArrayList<Seguradora> listaSeguradoras = new ArrayList<>();
		
		Seguradora seg1 = new Seguradora("67.004.577/0001-42", "Seg1", "107107401", "rua da seg1", "sg1@gmail.com");
		Seguradora seg2 = new Seguradora("26.799.662/0001-67", "Seg2", "11416481", "rua da seg2", "sg2@gmail.com");
		
		Date dataNascpf = new Date(-744229436L);
		ClientePF clientepf = new ClientePF ("Gustavo Juan Rafael Gomes", "25078446", 
				"Avenida das Sibipirunas", "gustavo@gmail.com", 0.,  
				"717.859.621-08", "masculino", "Graduacao", dataNascpf);
		
		Date dataNascpj = new Date(1542947764L);
		ClientePJ clientepj = new ClientePJ("Gabrielly e Thiago Buffet Ltda", "197041970",
				"Rua Francisco Olegário da Silva", "gabrielyy@gmail.com", 0., "31.378.915/0001-69", 
				dataNascpj, 900);
		
		Date dataNascCondutor = new Date(985152964L);
		Condutor condutor = new Condutor("622.249.355-60", "Antonella Fernanda Renata",
					"9846091401", "Travessa Nossa Senhora da Conceição", "antonella@asproplastic.com.br",
					dataNascCondutor);
		
		Frota frota = new Frota("codigo");
		
		Date datainicio = new Date(1174455364L);
		Date datafim = new Date(1686019934L);
		SeguroPJ seguropj = new SeguroPJ(datainicio, datafim, seg1, frota, clientepj);
		
		seguropj.autorizarCondutor(condutor);
		
		Date datainiciopf = new Date(1237613764L);
		Date datafimpf = new Date(1686020159L);
		
		Veiculo veiculopf = new Veiculo("ATT-1025", "mercedez", "amd", 2020);
		SeguroPF seguropf = new SeguroPF(datainiciopf, datafimpf, seg2, veiculopf, clientepf);
		
		Veiculo veiculopj = new Veiculo("ABC-1234", "ferrari", "forza", 2023);
		
		frota.addVeiculo(veiculopj);
		
		Date dataSinistro = new Date(1248154564L);
		Sinistro sinistro = new Sinistro(dataSinistro, "Rua José Queiroz", seg1, condutor);
		
		seguropj.gerarSinistro(sinistro);
		
		seg2.gerarSeguro(seguropf);
		listaSeguradoras.add(seg1);
		listaSeguradoras.add(seg2);
		Menu.iniciarMenuOperacao(listaSeguradoras);
		
	}
	
}
