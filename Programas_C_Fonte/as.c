#include <stdio.h>
#include <stdlib.h>

typedef struct queueElem{       //
    int data;                   //you can change for any type of data
    struct queueElem*next;      //
}queueELEM;                     //
typedef struct queue{
    struct queueElem*begin;
    struct queueElem*end;
}queue;
int opt;

queue*create(){
    queue*q = (queue*)malloc(sizeof(queue));
    if(!q)
        exit(1);
    else{
     q->begin = NULL;
     q->end = NULL;
    }
    return q;
}
int emptyQUEUE(queue*q){
    if(q==NULL) return 1;
    if(q->begin==NULL) return 1;
    else return 0;
}
int readVALUE(){
    int value;
    printf (" value to insert: ");
    scanf("%i", &value);
    return value;
}
queueELEM* allocate(int value){
    queueELEM* node = (queueELEM*)malloc(sizeof(queueELEM));
    if(!node)
        exit(1);
    else{
        node->data = value;
        node->next = NULL;
        return node;
    }
}
void enqueue(queue*q){
    queueELEM*node = allocate(readVALUE());
    if(!node)
        exit(1);
    if(q->end == NULL)
        q->begin = node;
    else
        q->end->next = node;
    q->end = node;
}
int dequeue(queue*q){
    if(emptyQUEUE(q)) return 0;

    queueELEM*node = q->begin;
    q->begin = q->begin->next;
    if(q->begin!=NULL)
        q->end = NULL;
    free(node);
    return 1;
}
void display(queue*q){
    if(emptyQUEUE(q)){
        printf (" empty queue;\n");
        return ;
    }
    queueELEM*aux = q->begin;
    printf ("\n  current queue: ");
    while(aux!=NULL){
        printf ("%i ", aux->data);
        aux = aux->next;
    }
    printf ("\n");
}
void cases(int opt, queue*q){
    switch(opt){
        case 1:
            enqueue(q);
            display(q);
            break;
        case 2:
            dequeue(q);
            display(q);
            break;
        default:
            if (opt!=0) printf (" invalid option;\n");
    }
}
int menu(){
    printf ("\n queue options;\n");
    printf ("  0 quit;\n");
    printf ("  1 enqueue;\n");
    printf ("  2 dequeue;\n");
    printf (" your choice: ");
    scanf("%i", &opt);
    return opt;
}
int main (void){
    queue*q = create();
    do{
        opt = menu();
        cases(opt,q);
    }while(opt);
    return 0;
}
