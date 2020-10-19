#include<stdio.h>
#include <locale.h>
float total = 0;

float conta(float gasto, float obra, float lucro){
	total = gasto + obra;
	float pct = total * lucro / 100;
	total = total + pct;
	return total;

}


int main(){
	setlocale(LC_ALL, "Portuguese");
	float gasto, obra, lucro;
	printf("Digite o valor gasto com o produto: \n");
	fflush(stdout);
	scanf("%f", &gasto);


	printf("Digite o valor da sua mão de obra: \n");
		fflush(stdout);
		scanf("%f", &obra);

		printf("Digite a porcentagem de lucro que  voce quer ter em cima do produto: \n");
			fflush(stdout);
			scanf("%f", &lucro);


			conta(gasto, obra, lucro);

			printf("O valor ideal da sua venda deve ser de:  R$ %.2f\n", total);

			return 0;
}
