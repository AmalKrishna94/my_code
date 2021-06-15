#include<stdio.h>
#include<stdlib.h>

int main(void){
    char name[100];
    printf("Enter a name: ");
    gets(name);
    printf("The name is: %s",name);


    return EXIT_SUCCESS;
} 