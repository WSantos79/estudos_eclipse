#include <stdio.h>

int main(){

	int i = 0;

	do {
		printf("\n\nInforma��o nutricional de sorvetes!\n\n");
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
			printf("\nVoc� escolheu flocos: ");
			printf("\n\nCalorias: 126 �Carboidratos: 15g �Gorduras: 6g �Prote�nas: 2g\n\n");
			break;
		case 2 :
					printf("\nVoc� escolheu morango: ");
					printf("\n\nCalorias: 126 �Carboidratos: 15g �Gorduras: 6g �Prote�nas: 2g\n\n");
					break;
		case 3 :
					printf("\nVoc� escolheu leite condensado: ");
					printf("\n\nCalorias: 126 �Carboidratos: 15g �Gorduras: 6g �Prote�nas: 2g\\n\n");
					break;
					default: if (i != 0)
					printf("\nOp��o invalida.\n");
		}
	}while (i !=0);
	printf("\n\nFim das opera��es. \n\n");



}
