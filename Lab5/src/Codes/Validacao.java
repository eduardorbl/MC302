package Codes;

public class Validacao 
{
	public static boolean validarCPF(String cpf) 
	{
	    String cpf_int = cpf.replaceAll("[^\\d]", "");

	    if (cpf_int.length() != 11) {
	        return false;
	    }

	    boolean allEqual = true;
	    for (int i = 0; i < cpf_int.length(); i++) {
	        if (cpf_int.charAt(9) != cpf_int.charAt(i)) {
	            allEqual = false;
	            break;
	        }
	    }
	    
	    if (allEqual) {
	        return false;
	    }

	    int n = 0;
	    int d1, d2;

	    for (int i = 0; i < 9; i++) {
	        n += Character.getNumericValue(cpf_int.charAt(i)) * (10 - i);
	    }
	    d1 = 11 - n % 11;
	    if (d1 > 9) {
	        d1 = 0;
	    }

	    n = 0;
	    for (int i = 0; i < 10; i++) {
	        n += Character.getNumericValue(cpf_int.charAt(i)) * (11 - i);
	    }
	    d2 = 11 - (n % 11);
	    if (d2 > 9) {
	        d2 = 0;
	    }

	    if (d1 == Character.getNumericValue(cpf_int.charAt(9)) && d2 == Character.getNumericValue(cpf_int.charAt(10))) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public static boolean validarCNPJ(String cnpj)
	{
		String cnpj_int = cnpj.replaceAll("[^\\d]", "");
	
		if (cnpj_int.length() != 14)
		{
			return false;
		}
	
		boolean allEqual = true;
		
		for (int i = 0; i < cnpj_int.length(); i++)
		{
			if (cnpj_int.charAt(0) != cnpj_int.charAt(i))
			{
				allEqual = false;
				break;
			}
		}
		
		if (allEqual)
		{
			return false;
		}
		
		int d1 = 0, d2 = 0;
		int soma = 0;
		for (int m = 5	; m > 1; m--)
		{
			soma += m * Character.getNumericValue(cnpj_int.charAt(5-m));
		}
		for (int m = 9; m > 1; m--)
		{
		soma += m * Character.getNumericValue(cnpj_int.charAt(13-m));
		}
			
		if (soma%11 < 2)
		{
			d1 = 0;
		} else
		{
			d1 = 11 - soma%11;
		}
		
		soma = 0;
		
		for (int m = 6; m > 1; m--)
		{
			soma += m * Character.getNumericValue(cnpj_int.charAt(6-m));
		}
		for (int m = 9; m > 1; m--)
		{
			soma += m * Character.getNumericValue(cnpj_int.charAt(14-m));
		}
		
		if (soma%11 < 2)
		{
			d2 = 0;
		} else
		{
			d2 = 11 - soma%11;
		}
		
		if (d1 == Character.getNumericValue(cnpj_int.charAt(12))
				&& d2 == Character.getNumericValue(cnpj_int.charAt(13)))
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	public static boolean validarNome (String Nome)
	{
		
		return Nome.matches("^[a-zA-Z\\s-]+$");
		
	}
	
	public static boolean validarTelefone (String Telefone)
	{
		return Telefone.matches("\\d+");

	}
	
	
}