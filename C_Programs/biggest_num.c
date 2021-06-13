#include<stdio.h>
#include<stdlib.h>

int main(void){
    int a,b;
    printf("Enter 2 numbers: \n");
    scanf("%d%d", &a,&b);
    if (a<b)
    {
        printf("%d is bigger than %d",b,a);
    }
    else
    {
        printf("%d is bigger than %d",a,b);
    }

    return EXIT_SUCCESS;
}