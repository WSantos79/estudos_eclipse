#include  <stdio.h>

int main (){

	int dia = 0;
	printf("Digite o n�mero correspondete ao dia da semana: \n");
	printf("Digite 1 para segunda-feira\n");
	printf("Digite 2 para ter�a-feira\n");
	printf("Digite 3 para quarta-feira\n");
	printf("Digite 4 para quinta-feira\n");
	printf("Digite 5 para seta-feira\n");
	printf("Digite 6 para s�bado\n");
	printf("Digite 7 para domingo\n");
	fflush(stdout);
	scanf("%d",&dia);

	switch (dia){
	case 1 :
		printf("Segunda-feira tem desconto de 40 por cento no valor da pizza!");
		break;
	case 2 :
		printf("Ter�a-feira tem desconto de 30 por cento no valor da pizza!");
		break;
	case 3 :
		printf("Quarta-feira � dia de pizza em dobro *-*");
		break;
	case 4 :
		printf("Quinta-feira tem desconto de 20 por cento no valor da pizza!");
		break;
	case 5 :
		printf("Sexta-feira tem desconto de 10 por cento no valor da pizza!");
		break;
	case 6 :
		printf("S�bado n�o tem desconto :(");
		break;
	case 7 :
		printf("Domingo � dia de refrigerante gr�tis *-*");
		break;
	default :
		printf("O n�mero digitado n�o corresponde a nenhum dia da semana!");

	}
}
