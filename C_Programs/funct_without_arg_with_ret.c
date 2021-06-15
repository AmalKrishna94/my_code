#include<stdlib.h>
#include<stdio.h>

int sum();
int main(void){
    int ret_value;
    ret_value=sum();
    printf("The sum is: %d", ret_value);

    return EXIT_SUCCESS;
}

int sum()
{
    int a,b,result;
    printf("Enter two numbers: \n");
    scanf("%d%d",&a,&b);
    result = a+b;
    return result;
}