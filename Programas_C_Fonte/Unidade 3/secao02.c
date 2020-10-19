#include<stdio.h>


float inserir (){
	const float ma = 321.43, mb = 150.72;
	float a, b;

	printf("Insira a quantidade de mol de A: ");
		fflush(stdout);
		scanf("%f", &a);
		fflush(stdin);
		printf("Insira a quantidade de mol de B: ");
			fflush(stdout);
			scanf("%f", &b);
			fflush(stdin);

			printf("\n mol A: mol B\tresultado");
			printf("\n 1,2  : 1,0\t= %.2f", 1.2*ma + 1*mb);
			printf("\n 1,4  : 1,0\t= %.2f", 1.4*ma + 1*mb);
			printf("\n 1,6  : 1,0\t= %.2f", 1*ma + 1.6*mb);





			return  a * ma + b * mb;  // primeiro vem a ** e depois a soma
}


int main (){



printf("\n\nMassa final do composto = %.2f g/mol", inserir());

}
