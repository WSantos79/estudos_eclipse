#include <stdio.h>

#include <stdlib.h>

#include <ctype.h>

int main( )

{

char nome[30];

int i;


printf("Digite o sobrenome do aluno ou aluna:\n");

fflush(stdout);
gets(nome);
fflush(stdin);

printf("\n\nSobrenome convertido: %s\n\n",nome);

fflush(stdin);
fflush(stdout);

for(i=0; nome[i]!= ' '; i++)


nome[i] = toupper(nome[i]);

//tolower

fflush(stdin);
fflush(stdout);

printf("\n\nSobrenome convertido: %s\n\n",nome);

fflush(stdin);
fflush(stdout);
}
