#include <stdio.h>
#include <stdlib.h>
float sal_bruto = 0, sal_liquido, inss = 0, IR = 0;

void print () {
	printf("O salário líquido é de: %.2f", sal_liquido);
	fflush(stdout);
	}

int main() {


	printf("Informe o salário bruto: ");
	fflush(stdout);
	scanf("%f", &sal_bruto);
	fflush(stdout);

	if (sal_bruto <= 1045.00) {
		inss = sal_bruto * 7.7 / 100;

	} else if (sal_bruto > 1045.00 && sal_bruto <= 2089.60) {
		inss = sal_bruto * 9 / 100;

	} else if (sal_bruto > 2089.60 && sal_bruto <= 3134.40) {
		inss = sal_bruto * 12 / 100;
	} else if (sal_bruto > 3134.40) {
		inss = sal_bruto * 14 / 100;
	}

	if (sal_bruto > 1903.99 && sal_bruto <= 2826.65) {
		IR = sal_bruto * 7.5 / 100;
	} else if (sal_bruto > 2826.65 && sal_bruto <= 3751.05) {
		IR = sal_bruto * 15 / 100;
	} else if (sal_bruto > 3751.05 && sal_bruto <= 4664.68) {
		IR = sal_bruto * 22.5 / 100;
	} else if (sal_bruto > 4664.68) {
		IR = sal_bruto * 27.5 / 100;
	}
	fflush(stdout);
	sal_liquido = sal_bruto - IR - inss;

	print();
	system("pause");
	return 0;
}
