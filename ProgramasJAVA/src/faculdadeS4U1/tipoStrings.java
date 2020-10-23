package faculdadeS4U1;

// Cria��o de valores literais com as classes String, StringBuilder e StringBuffer

public class tipoStrings {

	public static void main(String[] args) {

		String str1 = new String("Orienta��o a objetos");

		String str2 = "Orienta��o a objetos";

		StringBuilder str3 = new StringBuilder("Orienta��o a objetos");

			//StringBuilder str4 = "Orienta��o a objetos"; // n�o � aceito (d� erro)

		StringBuffer str5 = new StringBuffer("Orienta��o a objetos");

			//StringBuffer str6 = "Orienta��o a objetos"; // n�o � aceito (d� erro)
		
		System.out.println(str2);
		
		str2 = ("cuuuuu");
		
		System.out.println(str2);
		System.out.println();
		
		
		tipoStrings tipoStrings = new tipoStrings();
		System.out.println();
		tipoStrings.criacaoLiterais();
		System.out.println();
		tipoStrings.sequenciaDeCaracteres();
		System.out.println();
		tipoStrings.metodosStrings();
		System.out.println();
		tipoStrings.concatenaString();
		System.out.println();
		//tipoStrings.superConcatenacaoStrings();
		System.out.println();
		tipoStrings.comparacaoStrings();
		
	}
 



/**
na linha 1, vemos a primeira forma de cria��o de uma string, em que o objeto str1 aponta
para um objeto do tipo String com a mensagem �Orienta��o a objetos�, que � armazenada em uma regi�o de mem�ria
chamada Heap (pilha). Na linha 2, vemos a segunda forma de cria��o de strings feita diretamente, sem a utiliza��o
do construtor, e essa segunda forma tem um funcionamento diferente em rela��o � primeira, pois o objeto str2 aponta
para o literal string com a mensagem �Orienta��o a objetos�, que � armazenada em uma regi�o especial da mem�ria,
chamada String Pool. J� na linha 3, temos a constru��o de um objeto do tipo StringBuilder, que coloca esse objeto
na mem�ria heap; na linha 4, destacamos que n�o � poss�vel a cria��o de objetos StringBuilder com atribui��o direta
de valores literais; na linha 5, temos a constru��o de um objeto do tipo StringBuffer, que aloca esse objeto na
mem�ria heap; por fim, na linha 6, destacamos que tamb�m n�o � poss�vel a cria��o de objetos StringBuffer com
atribui��o direta de valores literais

 *
 *
 *
 *
 *
 *
 *
 *Como forma de entender melhor a ideia por tr�s das mem�rias Heap e String Pool, analise a Figura 4.4 a
 * seguir. Repare que toda vez que criamos um objeto com o operador new, o objeto � colocado na heap,
 *  e toda vez que criamos um objeto literal diretamente (sem o new), este � colocado na string pool.
 *   A vantagem da string pool sobre a heap � que ela economiza gastos com mem�ria. 
 *
 */

public void criacaoLiterais(){
    String str1 = new String("Orienta��o a objetos");
    String str2 = "Orienta��o a objetos";
    
    StringBuilder str3 = new StringBuilder("Orienta��o a objetos");
    //StringBuilder str4 = "Orienta��o a objetos";//n�o � aceito
    
    StringBuffer str5 = new StringBuffer("Orienta��o a objetos");
    //StringBuffer str6 = "Orienta��o a objetos";//n�o � aceito
    System.out.println("Criacao de literais: ");
    System.out.println("str1: " + str1);
    System.out.println("str2: " + str2);
    System.out.println("str3: " + str3);
    //System.out.println("str4: " + str4);
    System.out.println("str5: " + str5);
    //System.out.println("str6: " + str6);
}

public void sequenciaDeCaracteres(){
	System.out.println("Sequencia de Caracteres: ");
    char seqChar[] = {'l', 'i', 'v', 'r', 'o'};
    System.out.println(seqChar);
    for (char elemento : seqChar) {
        System.out.print(elemento);
    }
    System.out.println();
}

public void metodosStrings(){
	System.out.println("Metodos Strings: ");
    String nomeLivro = "Linguagem Orientada a Objetos";
    System.out.println(nomeLivro.toUpperCase());
    System.out.println(nomeLivro.toLowerCase());
    System.out.println(nomeLivro.replace("Linguagem", "Ling."));
    System.out.println(nomeLivro.length());
    System.out.println(nomeLivro.endsWith("Objetos"));
    System.out.println(nomeLivro.startsWith("Ling"));
    System.out.println(nomeLivro.contains("Orient"));
    String sp[] = nomeLivro.split(" ");
    for (String elem : sp) {
        System.out.println("elem: " + elem);
    }
    StringBuffer sBuffer = new StringBuffer("Linguagem");
    System.out.println("reverse: " + sBuffer);
    sBuffer = sBuffer.reverse();
    System.out.println("reverse: " + sBuffer);        
}

public void concatenaString() {
	System.out.println("Concatena String: ");
    String livro = "Linguagem";
    System.out.println(livro);
    livro = livro.concat(" Orientada");
    System.out.println(livro);
    livro += " a Objetos";
    System.out.println(livro);
}

public void superConcatenacaoStrings() {
	System.out.println("Super Concaternacao String: ");
    String superString = "";
    for (int i = 0; i < 100000; i++) {
        superString += ".";
    }
    System.out.println(superString);
}

public void comparacaoStrings() {
	System.out.println("Comparacao String: ");
    String s1 = "teste";
    String s2 = new String("teste");
    String s3 = s1;
    String s4 = new String("teste");
    System.out.printf("s2: %b\n", s1==s2);
    System.out.printf("s3: %b\n", s1==s3);
    System.out.printf("s3: %b\n", s2==s3);
    System.out.printf("s4: %b\n", s2==s4);
}
}

