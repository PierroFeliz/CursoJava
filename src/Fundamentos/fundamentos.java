package Fundamentos;

import java.util.Date;

// import fica fora.
// ctrl shift O organiza os imports

//import java.util.Date;
// comando para importar = import java.util...
// quando existe varios tipos de determinada extensão ele vai mencionar todas para escolha, quando tem só 1 ele pega direto.

//package são tipo pastas para organização.

public class fundamentos {
	
	// mudar perspectiva para java, pois agiliza na criação de projetos
	// sempre comentar o necessário
	// Main é o ponto de entrada
	// main + ctrl espaço para montar rapido
	// classe sempre com letra maiuscula
	
	public static void main(String[] args) {
		
		// se der erro no comentário pq ele está tentando corrigir pra inglês
		// ctrl m para focar no editor
		//ctrl shift F para indentar
        // Tab para indentar na mão
		// Final para const
		//variavel tem primeiro letra minuscula e segunda maiuscula
		final int ano = 2022;

		/*
		 * Comentário mais longo
		 */

		// Comentário curto

		/**
		 * Documentação
		 */

		// syso é um atalho para chamar o out do console
		System.out.println();
		
		// pode ser feito inferencia igual no C# (var)
		var teste = '1';
		var testeNumero = 2.3;
		
		// e conversão explicita
	    int teste2 = (int)testeNumero;
	    
	    System.out.println(teste2);

		// estrutura de dados -> Estruturas (listas, bancos, vetores, ...) que
		// representam a organização do dado
		// por exemplo: Data = Uma lista de datas é igual a [INT/INT/INT, ... ].
        // 1 byte é igual a 8 bits com 256 possibilidades de resultado
	    // primeiro bit representa se é negativo ou positivo
	    //java analisa o tipo e tenta detectar onde ele se encaixa.
	    
	    //-----------------------------------------------------//
		// Tipos primitivos:
       
		byte anosDeEmpresa = 23;              // 1 byte
		short numeroDeVoos = 542;             // 2 byte
		int id = 54789;            	          // 4 byte
		long pontoAcumulado = 31_258_954L;    // 8 bytes, pode colocar L no fim para especificar explicitamente
		//pode usar underline para "separar"
		
		float salario = 11_445.44F;           // 4 bytes
		// se não colocar . ou letra no fim ele vai tratar como int nas operações.
		double vendasAcumuladas = 11_939.33D; // 8 bytes
		
		boolean estaDeFerias = false;
		boolean estaDeAtestado = true;
		
		char status = 'b';
		// char é uma letra entre aspas simples
		// pode usar tabela unicode por exemplo '/u0018'
		// string não é primitivo.
		
	    //-----------------------------------------------------//
		
		// + concatena
		System.out.println(vendasAcumuladas + " é ");
		
		// campos destacados ( como as variaveis ) são campos reservados pela linguagem. ( 52 reservadas mais ou menos )
        // String é com letra maiuscula inicialmente.
		String nome = "leandro";
		// string = conjunto de char
		// não é reservada e por isso tem letra maiuscula no inicio, assim como o date.
		
		// tipos não primitivos podem usar o . para extensão/funções
		
		nome = nome.toUpperCase();
		nome = nome.concat("!" + nome);
		System.out.println(nome);
		
		//pode ser feito por fora tbm
		System.out.println("leco".toUpperCase());
		
		//pode ir quebrando o codigo
		// se colocar lenght (retornando um int)  no meio vai dar pau, mas no fim fechou.
		String y = "Bom dia X".replace("X", "Leco")
				              .toUpperCase();
		
		System.out.println(y);
		
		
		//date tem que importar
		// instancia de data.
		Date d = new Date();
		Date o = new Date();
		
		System.out.println(d);
		
		//JButton botao = new JButton();
		
		java.lang.String b = "teste";
		java.lang.System.out.println("oi");
		// esse java.lang é o pacote básico da linguagem, logo não precisa colocar, mas fica a dica que a maioria vem dele.
		// tudo que está dentro do java.lang está disponivel, o restante tem que importar.
		
		
		System.out.println("teste".charAt(1));
		
		
		System.out.println(b.toLowerCase().startsWith("tes"));
		System.out.println(b.equalsIgnoreCase("testE"));
		
		var u = "teste";
		u.toUpperCase();
		var n = 1;
		var din = 1.5f;
		
		// \n para quebrar linha
		System.out.println(b + "\n teste");
		
		//outro meio para concatenar usando printf. usa % + inicial da variavel
		// s para string, d para inteiro e f para flutuante(real)
		// definir quantos numeros apos a virgula usando %.2f
		System.out.printf("Nome: %s \n %d e R$%.2f",u,n,din);
		
		//outro meio de concatenar usando String.Format
		String frase = String.format("Nome: %s \n %d e R$%.2f",u,n,din);
		System.out.println("\n" + frase);
	}
}
