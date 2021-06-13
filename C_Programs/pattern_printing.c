#include<stdlib.h>
#include<stdio.h>

int main(void){
    int i,j,n;
    printf("Enter the row limit: ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=0;j<i;j++)
        {
            printf("%d",j+1);
        }
        printf("\n");
    }

    return EXIT_SUCCESS;
}