#include <stdio.h>
// CALCULAR O MDC DE DOIS NUMEROS
int calculoMDC(int n1, int n2) {
	int r = n1 % n2;

	if (r == 0) {
		return n2;

	} else {
		return calculoMDC(n2, r);
	}
}

int main() {
	int n1, n2, mdc;
	printf("Digite o primeiro n�mero para calcular o MDC: ");
	fflush(stdout);
	scanf("%d", &n1);
	printf("Digite o segundo n�mero para calcular o MDC: ");
	fflush(stdout);
	scanf("%d", &n2);

	mdc = calculoMDC(n1, n2);
	printf("O MDC dos n�meros (%d,%d) �: %d", n1, n2, mdc);
}
