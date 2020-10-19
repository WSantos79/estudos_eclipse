// Exemplo de fila dinamica na linguagem C
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int tamanho_fila = 0;

struct NO {
	int cod;
	struct NO *prox;
};

struct fila {
	struct NO *inicio, *fim;

};

struct NO* novoNO(int x) {
	struct NO *node = (struct NO*) malloc(sizeof(struct NO));
	if (!node)
		exit(1);
	else {
		node->cod = x;
		node->prox = NULL;
		return node;
	}
}

struct fila* inicia_fila() {
	struct fila *q = (struct fila*) malloc(sizeof(struct fila));
	if (!q)
		exit(1);
	else {
		q->inicio = NULL;
		q->fim = NULL;
	}
	return q;
}

int fila_vazia(struct fila *q) {
	if (q == NULL)
		return 1;
	if (q->inicio == NULL)
		return 1;
	else
		return 0;
}

void inserir_fila(struct fila *q, int x) {

	if (tamanho_fila == 20){
		system("cls");
				printf("\nVocê só pode fazer 20 denúncias simultaneamente.\n\n");
				system("pause");

}else{

	struct NO *node = novoNO(x);
	if (!node)
		exit(1);
	if (q->fim == NULL)
		q->inicio = node;

	else
		q->fim->prox = node;
	q->fim = node;
	tamanho_fila++;
}}

int remover_fila(struct fila *q) {
	if (fila_vazia(q)) {
		printf("\n A fila está vazia.\n\n");
		system("pause");
		return 0;
	}

	struct NO *node = q->inicio;
	q->inicio = q->inicio->prox;
	if (q->inicio == NULL)
		q->fim = NULL;
	free(node);
	tamanho_fila--;
	return 1;
}

void mostrar_fila(struct fila *q) {
	if (fila_vazia(q)) {
		printf("\n Não existe denúncias. \n");
	} else {

		printf("\n Sequência da fila:");
		struct NO *aux = q->inicio;

		while (aux != NULL) {
			printf(" - %d ", aux->cod);
			aux = aux->prox;

		}
	}

}

void menu(int *opcao_menu) {

	system("cls");

	printf("\n[1] Inserir o número da Denúncia. \n");
	printf("[2] Remover o número da Denúncia. \n");
	printf("[3] Mostrar a fila da Denúncia. \n");
	printf("[4] Total de Denúncia. \n");
	printf("[5] Sair. \n");
	printf(" Digite a opção desejada: \n");
	fflush(stdout);
	scanf("%d", opcao_menu);

}

int main() {
	setlocale(LC_ALL, "Portuguese");

	int opcao = 0, numero = 0;
	struct fila *q = inicia_fila();

	do {
		menu(&opcao);

		switch (opcao) {

		case 1:
			system("cls");
			printf("\n Informe o número da denúncia: ");
			fflush(stdout);
			scanf("%d", &numero);
			inserir_fila(q, numero);
			break;
		case 2:
			remover_fila(q);
			break;
		case 3:
			system("cls");
			mostrar_fila(q);
			printf("\n\n");
			system("pause");
			break;

		case 4:
			system("cls");
			printf("\n Tamanho da fila: %d\n\n", tamanho_fila);
			system("pause");
			break;
		}
		if (opcao < 1 || opcao > 5) {
			printf("\n Opção inválida, tente novamente.\n\n");
			system("pause");
		}

	} while (opcao != 5);

	return 0;

}

