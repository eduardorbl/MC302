package Codes;

public enum MenuOperacoes 
{
	CADASTRAR(1),
	LISTAR(2),
	EXCLUIR(3),
	GERARSINISTRO(4),
	TRANSFERIRSEGURO(5),
	CALCULARRECEITASEGURADORA(6),
	SAIR(0),
	ERRO(-1);
	
	private final int operacao;
	
	MenuOperacoes(int operacao)
	{
		this.operacao = operacao;
	}
	
	public final int getOperacao() {
		return operacao;
	}
	
	public static MenuOperacoes fromInt(int i) {
		
		for (MenuOperacoes op : MenuOperacoes.values())
		{
			if (op.getOperacao() == i)
				return op;
		}
		return null;
	}
	
	//ENUM CADASTRO
	public enum Cadastrar
	{
		CLIENTE(1),
		VEICULO(2),
		SEGURADORA(3),
		VOLTAR(0),
		ERRO(-1);
		
		private final int cadastro;
		
		private Cadastrar (int cadastro)
		{
			this.cadastro = cadastro;
		}
		
		public int getCadastro()
		{
			return cadastro;
		}
		public static Cadastrar fromInt(int i) {
			
			for (Cadastrar cadastro : Cadastrar.values())
			{
				if (cadastro.getCadastro() == i)
					return cadastro;
			}
			return null;
		}
		
		public enum tipoCliente
		{
			
			PF(1),
			PJ(2),
			VOLTAR(0),
			ERRO(-1);
			
			private final int tipo;
			
			private tipoCliente(int tipo)
			{
				this.tipo = tipo;
			}
			
			public int getTipo()
			{
				return tipo;
			}
			
			public static tipoCliente fromInt(int i)
			{
				
				for (tipoCliente tipo: tipoCliente.values())
				{
					if (tipo.getTipo() == i)
					{
						return tipo;
					}
				}	
				return null;
			}
		}
		
	}
	
	//ENUM LISTAR
	public enum Listar
	{
		CLIENTEPORSEG(1),
		SINISTROSPORSEG(2),
		SINISTROPORCLIENTE(3),
		VEICULOPORCLIENTE(4),
		VEICULOPORSEGURADORA(5),
		VOLTAR(0),
		ERRO(-1);
		
		private final int lista;
		
		Listar (int lista)
		{
			this.lista = lista;
		}
		
		public int getListar()
		{
			return lista;
		}
		
		public static Listar fromInt(int i) {
			
			for (Listar lista : Listar.values())
			{
				if (lista.getListar() == i)
					return lista;
			}
			return null;
		}
		
	}
	
	public enum Excluir
	{
		CLIENTE(1),
		VEICULO(2),
		SINISTRO(3),
		VOLTAR(0),
		ERRO(-1);
		
		private final int exclusao;
		
		Excluir (int exclusao)
		{
			this.exclusao = exclusao;
		}
		
		public int getExclusao()
		{
			return exclusao;
		}
		
		public static Excluir fromInt(int i) {
			
			for (Excluir exclusao : Excluir.values())
			{
				if (exclusao.getExclusao() == i)
					return exclusao;
			}
			return null;
		}
	}
}
