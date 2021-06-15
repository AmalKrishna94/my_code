#include<stdio.h>
#include<stdlib.h>

void sum(int,int);
int main(void){
    int a,b;
    printf("Enter two numbers: \n");
    scanf("%d%d", &a,&b);
    sum(a,b);


    return EXIT_SUCCESS;
}

void sum(int num1, int num2)
{
    int sum;
    sum = num1 + num2;
    printf("The sum is: %d",sum);
}