#include<stdio.h>


int main () {

	int X = 5, * ptr;

	 *ptr = X;

	 printf("X = %d\n", X);

	 printf("Ponteiro aponta para: %d\n", *ptr);

	 printf("memoria do ponteiro: %p\n", &ptr);


}
