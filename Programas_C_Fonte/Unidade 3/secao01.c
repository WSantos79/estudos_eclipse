#include <stdio.h>

float calcular(){
	float base, altura, comprimento;

	printf("Digite a base: ");
	fflush(stdout);
	scanf("%f", &base);
	printf("Digite a altura: ");
	fflush(stdout);
	scanf("%f", &altura);
	printf("Digite o comprimento: ");
	fflush(stdout);
	scanf("%f", &comprimento);



	return base * altura * comprimento * 25;
}


void main (){

float peso = calcular();

if (peso <= 500){
	printf("O guindaste recomendado é o G1");

}else if(peso > 500 && peso  <= 1500) {
		printf("O guindaste recomendado é o G2");

}else {
		printf("O guindaste recomendado é o G3");
	}
}


