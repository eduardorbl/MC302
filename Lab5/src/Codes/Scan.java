package Codes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Scan {
	
	/**
	 * 
	 * @param String que vai ser pedida com artigo e sem espacos
	 * @param String que refere-se a quem pertence o que vai ser pedido
	 * @return String digitada pelo usuario
	 */
	public static String lerString(String parametro, String classe)
	{
		
		System.out.println("Digite " + parametro + " " + classe + ":");
		Scanner s = new Scanner(System.in);		
		String string_return = s.nextLine();
		return string_return;
		
	}
	
	/**
	 * 
	 * @param <T> Representa a classe da lista que iremos analisar
	 * @param classe Diz respeito a String da classe sem artigo e sem espacos
	 * @param lista ArrayList de termos da classe T
	 * @return Retorna o termo selecionado pelo usuario
	 */
	public static <T> T Selecione (String classe, ArrayList<T> lista)
	{	
		T t = null;
		if (lista.size()==0)
		{
			System.out.println("Nao existe " + classe + " para selecionar. Faca o cadastro.");
			return null;
		}
		
		System.out.println("Selecione " + classe + ":");
		
		for (int i = 0; i < lista.size(); i++)
		{
			System.out.println("(" + i + ")" + lista.get(i));
		}
		
		Scanner s = new Scanner(System.in);	
		boolean erro = true;
		do {
			String seg_string = s.nextLine();
			try {
				t = lista.get(Integer.parseInt(seg_string));
				erro = false;
			} catch (Exception e) {
				System.out.println("Valor invalido! Digite novamente");
			}
		} while (erro);
		
		return t;
	}
	
	public static Date lerData (String parametro, String classe)
	{
		System.out.println("Digite a data de " + parametro + " "+ classe + " (dd/mm/yyyy):");
		Date data = null;
		boolean continua = true;
		while(continua)
		{	
			try {
				Scanner s = new Scanner(System.in);	
				String data_string = s.nextLine();
				data = new SimpleDateFormat("dd/MM/yyyy").parse(data_string);
				continua = false;
			} catch (ParseException e) {
				System.out.println("Digite novamente, formato incorreto");	
			}
		}
		
		return data;
	}
	
	public static int lerInteiro (String parametro, String classe)
	{
		System.out.println("Digite o numero de " + parametro + classe + ":");
		
		int inteiro = 0;
		boolean continua = true;
		while(continua)
		{	
			Scanner s = new Scanner(System.in);	
			String inteiro_string = s.nextLine();	
			try {
				inteiro = Integer.parseInt(inteiro_string);
				if (inteiro > 0)
				{
					continua = false;
				} else
				{
					System.out.println("Numero invalido, digite novamente");
				}
			} catch 
				(Exception e) {System.out.println("Numero invalido, digite novamente");
			}		
		}	
		return inteiro;	
	}
	
}
