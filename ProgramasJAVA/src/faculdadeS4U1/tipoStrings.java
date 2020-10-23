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
		
	}
 
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

