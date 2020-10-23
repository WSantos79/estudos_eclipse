package faculdadeS4U1;

// Criação de valores literais com as classes String, StringBuilder e StringBuffer

public class tipoStrings {

	public static void main(String[] args) {

		String str1 = new String("Orientação a objetos");

		String str2 = "Orientação a objetos";

		StringBuilder str3 = new StringBuilder("Orientação a objetos");

			//StringBuilder str4 = "Orientação a objetos"; // não é aceito (dá erro)

		StringBuffer str5 = new StringBuffer("Orientação a objetos");

			//StringBuffer str6 = "Orientação a objetos"; // não é aceito (dá erro)
		
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
na linha 1, vemos a primeira forma de criação de uma string, em que o objeto str1 aponta
para um objeto do tipo String com a mensagem “Orientação a objetos”, que é armazenada em uma região de memória
chamada Heap (pilha). Na linha 2, vemos a segunda forma de criação de strings feita diretamente, sem a utilização
do construtor, e essa segunda forma tem um funcionamento diferente em relação à primeira, pois o objeto str2 aponta
para o literal string com a mensagem “Orientação a objetos”, que é armazenada em uma região especial da memória,
chamada String Pool. Já na linha 3, temos a construção de um objeto do tipo StringBuilder, que coloca esse objeto
na memória heap; na linha 4, destacamos que não é possível a criação de objetos StringBuilder com atribuição direta
de valores literais; na linha 5, temos a construção de um objeto do tipo StringBuffer, que aloca esse objeto na
memória heap; por fim, na linha 6, destacamos que também não é possível a criação de objetos StringBuffer com
atribuição direta de valores literais

 *
 *
 *
 *
 *
 *
 *
 *Como forma de entender melhor a ideia por trás das memórias Heap e String Pool, analise a Figura 4.4 a
 * seguir. Repare que toda vez que criamos um objeto com o operador new, o objeto é colocado na heap,
 *  e toda vez que criamos um objeto literal diretamente (sem o new), este é colocado na string pool.
 *   A vantagem da string pool sobre a heap é que ela economiza gastos com memória. 
 *
 */

public void criacaoLiterais(){
    String str1 = new String("Orientação a objetos");
    String str2 = "Orientação a objetos";
    
    StringBuilder str3 = new StringBuilder("Orientação a objetos");
    //StringBuilder str4 = "Orientação a objetos";//não é aceito
    
    StringBuffer str5 = new StringBuffer("Orientação a objetos");
    //StringBuffer str6 = "Orientação a objetos";//não é aceito
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

