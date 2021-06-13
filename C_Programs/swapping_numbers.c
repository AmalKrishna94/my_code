#include <stdio.h>
#include <stdlib.h>

int main(void){
    int a,b,temp;
    printf("Give the first number: ");
    scanf("%d",&a);
    printf("Give the second number: ");
    scanf("%d",&b);
    temp=a;
    a=b;
    b=temp;
    printf("After swapping, the first number is %d and the second number is %d",a,b);


    return EXIT_SUCCESS;
}
