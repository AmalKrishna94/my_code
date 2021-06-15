#include<stdlib.h>
#include<stdio.h>

int main(void){
    int i,j,n;
    printf("Enter the row limit: ");
    scanf("%d",&n);
    for(i=n;i>=1;i--)
    {
        for(j=i;j>=1;j--)
        {
            printf("* ");
        }
        printf("\n");
    }

    return EXIT_SUCCESS;
}