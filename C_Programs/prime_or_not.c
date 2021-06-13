#include<stdlib.h>
#include<stdio.h>

int main(void){
    int flag = 0,i,n;
    printf("Please enter a number to check Prime or not.. :");
    scanf("%d",&n);
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        printf("%d is a prime number..!!",n);
    }
    else
    {
        printf("%d is a non-prime number..!!",n);
    }

    return EXIT_SUCCESS;
}