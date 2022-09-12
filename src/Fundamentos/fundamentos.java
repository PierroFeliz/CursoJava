package Fundamentos;

//import java.util.Scanner;

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

		{
			// se der erro no comentário pq ele está tentando corrigir pra inglês
			// ctrl m para focar no editor
			// ctrl shift F para indentar
			// Tab para indentar na mão
			// Final para const
			// variavel tem primeiro letra minuscula e segunda maiuscula
			// final int ano = 2022;

			/*
			 * Comentário mais longo
			 */

			// Comentário curto

			/**
			 * Documentação
			 */

			// syso é um atalho para chamar o out do console
			// System.out.println();

			// pode ser feito inferencia igual no C# (var)
			// var teste = '1';
			// var testeNumero = 2.3;

			// e conversão explicita
			// int teste2 = (int) testeNumero;

			// System.out.println(teste2);

			// estrutura de dados -> Estruturas (listas, bancos, vetores, ...) que
			// representam a organização do dado
			// por exemplo: Data = Uma lista de datas é igual a [INT/INT/INT, ... ].
			// 1 byte é igual a 8 bits com 256 possibilidades de resultado
			// primeiro bit representa se é negativo ou positivo
			// java analisa o tipo e tenta detectar onde ele se encaixa Long > Int, etc.

			// -----------------------------------------------------//
			// Tipos primitivos:

			// byte anosDeEmpresa = 23; // 1 byte
			// short numeroDeVoos = 542; // 2 byte
			// int id = 54789; // 4 byte
			// long pontoAcumulado = 31_258_954L; // 8 bytes, pode colocar L no fim para
			// especificar explicitamente
			// pode usar underline para "separar"

			// float salario = 11_445.44F; // 4 bytes
			// se não colocar . ou letra no fim ele vai tratar como int nas operações.
			// double vendasAcumuladas = 11_939.33D; // 8 bytes

			// boolean estaDeFerias = false;
			// boolean estaDeAtestado = true;

			// char status = 'b';
			// char é uma letra entre aspas simples
			// pode usar tabela unicode por exemplo '/u0018'
			// string não é primitivo.

			// -----------------------------------------------------//

			// + concatena
			// System.out.println(vendasAcumuladas + " é ");

			// campos destacados ( como as variaveis ) são campos reservados pela linguagem.
			// ( 52 reservadas mais ou menos )
			// String é com letra maiuscula inicialmente.
			// String nome = "leandro";
			// string = conjunto de char
			// não é reservada e por isso tem letra maiuscula no inicio, assim como o date.

			// tipos não primitivos podem usar o . para extensão/funções

			// nome = nome.toUpperCase();
			// nome = nome.concat("!" + nome);
			// System.out.println(nome);

			// pode ser feito por fora tbm
			// System.out.println("leco".toUpperCase());

			// pode ir quebrando o codigo
			// se colocar lenght (retornando um int) no meio vai dar pau, mas no fim fechou.
			// String y = "Bom dia X".replace("X", "Leco").toUpperCase();

			// System.out.println(y);

			// date tem que importar
			// instancia de data.
			// Date d = new Date();
			// Date o = new Date();

			// System.out.println(d);

			// JButton botao = new JButton();

			// java.lang.String b = "teste";
			// java.lang.System.out.println("oi");
			// esse java.lang é o pacote básico da linguagem, logo não precisa colocar, mas
			// fica a dica que a maioria vem dele.
			// tudo que está dentro do java.lang está disponivel, o restante tem que
			// importar.

			// System.out.println("teste".charAt(1));

			// System.out.println(b.toLowerCase().startsWith("tes"));
			// System.out.println(b.equalsIgnoreCase("testE"));

			// var u = "teste";
			// u.toUpperCase();
			// var n = 1;
			// var din = 1.5f;

			// \n para quebrar linha
			// System.out.println(b + "\n teste");

			// outro meio para concatenar usando printf. usa % + inicial da variavel
			// s para string, d para inteiro e f para flutuante(real)
			// definir quantos numeros apos a virgula usando %.2f
			// System.out.printf("Nome: %s \n %d e R$%.2f", u, n, din);

			// outro meio de concatenar usando String.Format
			// String frase = String.format("Nome: %s \n %d e R$%.2f", u, n, din);
			// System.out.println("\n" + frase);

			// ---------------------------//

			// System.out.print("bom");
			// System.out.println(" \n bom");
			// System.out.printf("dia %d", 1);
			// %n pode quebrar linha tbm
		}
		{
			/*
			 * // para receber dados do teclado usamos o Scanner para scanear // colocar
			 * system.in para especificar a entrada como teclado no console // out
			 * referencia todas as saidas (console, pc, impressora, ... ) Scanner entrada =
			 * new Scanner(System.in);
			 * 
			 * // next para "chamar/esperar" o resultado do scan System.out.print("Nome: ");
			 * String nickname = entrada.nextLine(); System.out.print("Sobrenome: "); String
			 * sobrenome = entrada.nextLine(); System.out.print("idade: "); int idade =
			 * entrada.nextInt();
			 * 
			 * 
			 * System.out.printf("%n%s %s tem %d", nickname, sobrenome, idade);
			 * 
			 * // quando realizado a atividade, fechar o scanner para n ocupar recursos!
			 * entrada.close();
			 */

			// observação o nextint vai ler os inteiros,
			// mas quando apertamos enter para ir pro proximo ele acaba deixando o \n
			// ja que n é o numero, caso a gente dê um nextline tentando pegar o nome ele
			// vai bugar
			// pois o \n de antes vai ser passado pra frente, pois o nextline lê até o \n
			// pode ser resolvido colcando um nextline após o nextint;

		}
		/*
		 * { // falamos que nome recebeu um objeto, onde possui atributos e
		 * comportamentos // quando colocamos '.' // -> String nome = "leco";
		 * 
		 * // em um lado temos os tipos primitivos e no outro os objetos
		 * 
		 * // para se ter o mesmo comportamento em tipos primitivos, usamos os wrappers,
		 * // onde colocamos eles em "uma versão de objetos" Byte s = 100; Short d =
		 * 2000; Integer h = 30000; // int Long l = 10000L; Boolean bo =
		 * Boolean.parseBoolean("true"); Character c = 't'; Double v = 45.5D; Float f =
		 * 35.5F; // no geral coloca em maiusculo, mas o int e o char fica por extenso
		 * 
		 * String teste = "10"; Integer teste2 = Integer.parseInt(teste);
		 * 
		 * 
		 * System.out.println(teste2.toString());
		 * 
		 * }
		 */

		{
				int b = (int) 12; //conversão explicita ( cast ), 
				                  // caso ultrapasse o valor maximo da variavel ele volta pro valor minimo ( possivelmente negativo )
		}

	}
}
