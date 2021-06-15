#include<stdlib.h>
#include<stdio.h>

int main(void){
    int a[100][100], n, m, i, j;
    printf("Enter the dimension values: \n");
    scanf("%d%d",&n,&m);
    printf("Please enter the values into the matrix:\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nThe matrix is:\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }


    return EXIT_SUCCESS;
}