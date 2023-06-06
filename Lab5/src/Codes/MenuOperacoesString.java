package Codes;

public enum MenuOperacoesString {

	CADASTRAR("(1)Cadastros"),
	LISTAR("(2)Listar"),
	EXCLUIIR("(3)Excluir"),
	GERARSINISTRO("(4)Gerar Sinistro"),
	CALCULARRECEITASEGURADORA("(5)Calcular Receita Seguradora"),
	SAIR("(0)Sair");
	
	private final String operacao;
	
	private MenuOperacoesString(String operacao) {
		
		this.operacao = operacao;
	}
	
	private final String getOperacao()
	{
		return operacao;
	}
	
	public static void printarMenu()
	{	
		for (MenuOperacoesString op: MenuOperacoesString.values())
		{
			System.out.println(op.getOperacao());
		}
	}
	
	//ENUM CADASTRAR
	public enum Cadastrar 
	{
		
		CLIENTE("(1)Cadastrar Cliente"),
		VEICULO("(2)Cadastrar Veiculo"),
		SEGURADORA("(3)Cadastrar Seguradora"),
		CONDUTOR("(4)Cadastrar Condutor"),
		FROTA("(5)Cadastrar Frota"),
		SEGURO("(6)Cadastrar Seguro"),
		VOLTAR("(0)Retornar ao menu anterior");
		
		private final String cadastro;
		
		private Cadastrar(String cadastro)
		{
			this.cadastro = cadastro;
		}

		private String getCadastro()
		{
			return cadastro;
		}
		
		public static void printarCadastrar()
		{
			for (Cadastrar cadastro: Cadastrar.values())
			{
				System.out.println(cadastro.getCadastro());
			}
		}
		
		public enum tipoCliente
		{
			
			PF("(1)Cliente PF"),
			PJ("(2)Cliente PJ"),
			VOLTAR("(0)Retornar ao menu anterior");
			
			private final String tipo;
			
			private tipoCliente(String tipo)
			{
				this.tipo = tipo;
			}
			
			private String getTipo()
			{
				return tipo;
			}
			
			public static void printarTipo()
			{
				for (tipoCliente tipo: tipoCliente.values())
				{
					System.out.println(tipo.getTipo());
				}
			}
			
		}
		
		public enum tipoSeguro
		{
			
			PF("(1)Seguro PF"),
			PJ("(2)Seguro PJ"),
			VOLTAR("(0)Retornar ao menu anterior");
			
			private final String tipo;
			
			private tipoSeguro(String tipo)
			{
				this.tipo = tipo;
			}
			
			private String getTipo()
			{
				return tipo;
			}
			
			public static void printarTipo()
			{
				for (tipoSeguro tipo: tipoSeguro.values())
				{
					System.out.println(tipo.getTipo());
				}
			}
			
		}
		
	}
	
	//ENUM LISTAR
	public enum Listar
	{
		
		CLIENTEPORSEG("(1)Listar clientes por seguradora"),
		SINISTROPORCLIENTE("(2)Listar sinistros por cliente"),
		VEICULOPORCLIENTE("(3)Listar veiculos por cliente"),
		CONDUTORPORSEGURADORA("(4)Listar condutor por seguro"),
		SEGUROPORSEGURADORA("(5)Listar seguro por seguradora"),
		VOLTAR("(0)Retornar ao menu anterior");
		
		private final String lista;
		
		private Listar(String lista)
		{
			this.lista = lista;
		}
		
		private String getLista()
		{
			return lista;
		}
		
		public static void printarListar()
		{
			for (Listar lista: Listar.values())
			{
				System.out.println(lista.getLista());
			}
		}
	}
	
	//ENUM EXCLUIR
	
	public enum Excluir
	{
		
		CLIENTE("(1)Excluir cliente"),
		VEICULO("(2)Excluir veiculo"),
		SINISTRO("(3)Excluir sinistro"),
		SEGURADORA("(4)Excluir seguradora"),
		FROTA("(5)Excluir frota"),
		CONDUTOR("(6)Excluir condutor"),
		SEGURO("(7)Excluir seguro"),
		VOLTAR("(0)Retornar ao menu anterior");
		
		private final String exclusao;
		
		private Excluir(String exclusao)
		{
			this.exclusao = exclusao;
		}
		
		private String getExclusao()
		{
			return exclusao;
		}
		
		public static void printarExcluir()
		{
			for (Excluir exclusao: Excluir.values())
			{
				System.out.println(exclusao.getExclusao());
			}
		}		
	}
}
