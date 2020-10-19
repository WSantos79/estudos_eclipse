#include<bits/stdc++.h>
using namespace std;
typedef struct fila Fila;
Fila * cria_fila(void);
void inserir_item(Fila * f, int v);
int remover_item(Fila * f);
int fila_vazia(Fila * f);


Fila * criar_fila (void) {
Fila * f = (Fila *) malloc(sizeof(Fila));
f->n = 0;
f->ini = 0;
return f;



}

int fila_vazia(Fila * f) {
return (f->ini == NULL);
}


void inserir_item (Fila * f, int v) {
ElemFila * n = (ElemFila *)malloc(sizeof(ElemFila));
assert(!(n == NULL));
n->info = v;
n->prox = NULL;
if (!fila_vazia(f))
f->fim->prox = n;
else
f->ini = n;

f->fim = n;
}

if (n==NULL) {printf("sem memoria\n"); exit(1);}

int remover_item (Fila * f) {
ElemFila * t; int v;
assert(!fila_vazia(f));

t = f->ini;
v = t->info;
f->ini = t->prox;
if (f->ini == NULL)
f->fim = NULL;
free(t);
return v;
}

if (fila_vazia(f)) {
printf("Fila vazia.\n");
 exit(1);
}

