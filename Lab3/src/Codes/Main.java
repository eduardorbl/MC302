package Codes;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vamos iniciar o cadastro do primeiro cliente PF. Pressione enter para continuar.");
		s.nextLine();
		
		System.out.println("Digite o cpf");
		String cpf = s.nextLine();
		
		System.out.println("Informe o gênero");
		String genero = s.nextLine();
		
		System.out.println("Informe a data da licença");
		Date dataLicenca = Date.parse(s.next());
				
		System.out.println("");
		
		
		
		s.close();
	}

}
