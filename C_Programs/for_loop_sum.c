#include<stdio.h>
#include<stdlib.h>

int main(void){
    int i,n;
    int sum=0;
    printf("Please enter a number: ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
       sum = sum+i; 
    }
    printf("The sum is: %d",sum);


    return EXIT_SUCCESS;
}