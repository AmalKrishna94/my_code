#include<stdio.h>
#include<stdlib.h>

void sum();
int main(void){
    sum();
    return EXIT_SUCCESS;
}

void sum()
{
    int a, b;
    printf("Enter two numbers: \n");
    scanf("%d%d", &a,&b);
    int sum = a+b;
    printf("The sum is: %d",sum);
}