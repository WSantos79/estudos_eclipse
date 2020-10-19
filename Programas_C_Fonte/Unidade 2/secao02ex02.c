#include <stdio.h>

int main(){

	int i = 0;

	do {
		printf("\n\nInformação nutricional de sorvetes!\n\n");
		printf("Escolha um sabor: ");
		printf("\n (1) Sorvete de flocos.");
		printf("\n (2) Sorvete de morango.");
		printf("\n (3) Sorvete de leite condensado.");
		printf("\n (0) Escolha 0 para sair.");
		fflush(stdout);
		scanf("%d", &i);
		fflush(stdin);

		switch (i){
		case 1 :
			printf("\nVocê escolheu flocos: ");
			printf("\n\nCalorias: 126 •Carboidratos: 15g •Gorduras: 6g •Proteínas: 2g\n\n");
			break;
		case 2 :
					printf("\nVocê escolheu morango: ");
					printf("\n\nCalorias: 126 •Carboidratos: 15g •Gorduras: 6g •Proteínas: 2g\n\n");
					break;
		case 3 :
					printf("\nVocê escolheu leite condensado: ");
					printf("\n\nCalorias: 126 •Carboidratos: 15g •Gorduras: 6g •Proteínas: 2g\\n\n");
					break;
					default: if (i != 0)
					printf("\nOpção invalida.\n");
		}
	}while (i !=0);
	printf("\n\nFim das operações. \n\n");



}
