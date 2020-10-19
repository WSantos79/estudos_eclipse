#include <stdio.h>

#include <stdlib.h>

#include <ctype.h>

int main()

{

 int Matriz[31][31], i, j, ordem=0, quadrado_da_ordem=0, linha=0, coluna=0, soma=0;


printf("Qual a ordem do quadrado magico? (deve ser um numero impar positivo) \n");
fflush(stdout);
scanf("%d" , &ordem);


//encerra o programa se a ordem for par (pois so funciona para numeros impares)

if(ordem%2==0 || ordem <=0)

{


printf("Tem que ser numero impar positivo \n");

return(0);

}

quadrado_da_ordem = ordem * ordem;


printf("Quantidade de numero no Quadrado Magico: %d\n", quadrado_da_ordem);


//calculo da posicao inicial (onde vai o numero “1”).


// Quando a ordem e diferente de 1, sera sempre na penultima coluna e na ultima linha.

if (ordem == 1)

{



linha = 0;

coluna = 0;

}

else

{

linha = ((ordem+1)/2) - 1;

coluna = ordem - 1;

}

//Loop de loop para zerar a Matriz

for (i=0; i<ordem; i++)

{

for (j=0; j<ordem; j++)

{

Matriz[i][j] = 0;

}



}


//Preenchendo a Matriz com os valores do Quadrado Magico

for(i=1; i<=quadrado_da_ordem; i++)

{

Matriz[linha][coluna] = i;



//se estamos na ultima coluna, voltamos a coluna “0”, do contrario, vamos uma coluna a frente.


if (coluna == ordem - 1) { coluna = 0; } else { coluna++;

}

// se estamos na primeira linha, vamos a ultima coluna (ordem-1), do contrario, vamos uma linha atras


if (linha == 0) { linha = ordem - 1; } else { linha--; }

//Se a proxima posição ja esta¡ ocupada (e diferente de “0”), devemos ocupar a posicao

//do lado esquerdo da ultima posicao preenchida.


//Caso contrario, devemos preencher a posição acima e a direita

//da ultima posição preenchida.

if (Matriz[linha][coluna] != 0)

{

if (coluna == 0) { coluna = ordem - 2; } else { coluna = coluna - 2; }

if(linha == ordem - 1) { linha = 0; } else { linha++;

}

}

}

printf("\nO quadrado magico de %dx%d e:\n", ordem, ordem);


//Loop de loop para imprimir a Matriz

for (i=0; i<ordem; i++)

{

for (j=0; j<ordem; j++)

{

printf("%03d ", Matriz[i][j]);

}

printf("\n");

}

//Loop para calcular a soma de linhas, colunas e da diagonal principal do Quadrado magico.

for(i=0; i<ordem; i++)

{

soma = soma + Matriz[i][i];

}

printf("A soma de cada linha, de cada coluna ou da diagonal principal e: %d", soma);

return(0);

}


