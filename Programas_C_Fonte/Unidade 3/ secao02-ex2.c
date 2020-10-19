#include <stdio.h>

 float calcular (float valor, char plano, int meses){
	  if  ((plano == 'a' || plano == 'A') && meses >= 24 ){
		  return valor * 0.02 *  meses;

	  }else if((plano == 'b' || plano == 'B') && meses >= 12){
		  return valor * 0.008 * meses ;

	  }else {printf("Dados invalidos!");
	  return 0;


 }
 }

int main (){
	float valor, rendimento;
	char plano;
	int meses;

	printf("Insira o valor a ser investido: ");
	fflush(stdout);
	scanf("%f", &valor);
	fflush(stdin);
	printf("\nQual o plano a ou b? ");
	fflush(stdout);
	scanf("%c", &plano);

	printf("\nPor quanto tempo pretende deixar? meses: ");
	fflush(stdout);
	scanf("%d", &meses);

	rendimento = calcular(valor, plano, meses);
	printf("\nSeu rendimento sera de : %.2f", rendimento);
	return 0;

}
