#include <stdio.h>
#include <math.h>

//RAIZ QUADRADA

float calcularRaiz(float n, float raizant) {

	float raiz = (pow(raizant, 2) + n) / (2 * raizant);
	if (fabs(raiz - raizant) < 0.001)
		return raiz;
	return calcularRaiz(n, raiz);
}

int main() {
	float numero, raiz;
	printf("Informe o valor a ser calculado: ");
	fflush(stdout);
	scanf("%f", &numero);

	raiz = calcularRaiz(numero, numero / 2);

	printf("\nRaiz quadrada função = %.2f", raiz);
}
