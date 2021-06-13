#include<stdlib.h>
#include<stdio.h>

int main(void){
    int a;
    printf("Enter a nummber: \n");
    scanf("%d", &a);
    if(a<0)
    {
        printf("%d is a negative number..!!",a);
    }
    else
    {
        printf("%d is a positive number..!!",a);
    }

    return EXIT_SUCCESS;
}