#include <stdio.h>

int main(){
	float nota=0, nota_total=0;
	char letra;
	int qnt = 0;

	do {
	printf("Digite uma nota de avaliação: ");
  	fflush(stdout);
	scanf("%f", &nota);
	fflush(stdin);
	nota_total = nota + nota_total;

	printf("Digite qualquer letra para continuar ou 's' para sair.");
	fflush(stdout);
	scanf("%c", &letra);
	qnt++;
	}
	while (letra != 's');
	printf("\nQuantidade de avaliação %d e soma das notas %2.f", qnt, nota_total);
	printf("\nMedia das notas: %2.f", nota_total / qnt);
	system("PAUSE");
	return 0;
}





