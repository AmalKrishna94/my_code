#include<stdlib.h>
#include<stdio.h>

int main(void){
    int a,b,c;
    printf("Enter three numbers: \n");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b)
    {
        if(a>c)
        {
            printf("%d is the biggest among three..!!",a);
        }
        else
        {
            printf("%d is the biggest among three..!!",c);
        }
    }
    else if(b>a)
    {
        if(b>c)
        {
            printf("%d is the biggest among three..!!",b);
        }
        else
        {
            printf("%d is the biggest among three..!!",c);
        }
    }
    else
    {
       printf("%d is the biggest among three..!!",c); 
    }

    return EXIT_SUCCESS;

}