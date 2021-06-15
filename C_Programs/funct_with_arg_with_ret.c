#include<stdlib.h>
#include<stdio.h>

int sum(int,int);
int main(void){
    int a,b,c;
    printf("Enter two numbers: \n");
    scanf("%d%d",&a,&b);
    c=sum(a,b);
    printf("The sum is: %d",c);

    return EXIT_SUCCESS;
}

int sum(int num1, int num2)
{
    int result = num1 + num2;
    return result;
}