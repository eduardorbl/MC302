package Codes2;

public class Main {

	public static void main(String[] args) {
		
		Veiculo meuVeiculo = new Veiculo("a1b2c3d4", "bmw", "x5");
		Cliente meuCliente = new Cliente("lucas felix", "12384348515", "Abril de 1996", 27);
		Seguradora minhaSeguradora = new Seguradora("Seg", "30332288", "seg@uol.com", "Avenida Paulista");
		Sinistro meuSinistro = new Sinistro(12345, "25 de janeiro de 2022", "Unicamp");
		
		System.out.print(meuVeiculo.getMarca()+"\n");
		System.out.print(meuCliente.getNome()+"\n");
		System.out.print(minhaSeguradora.getEndereco()+"\n");
		System.out.print(meuSinistro.getId()+"\n");
		
		System.out.print(meuCliente.validarCPF());
		

	}

}
