#include<stdlib.h>
#include<stdio.h>

int main(void){
    int limit,i,j,temp,a[100];
    printf("Enter the limit: ");
    scanf("%d", &limit);
    printf("Enter the numbers into array: \n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("The array is:\n");
    for(i=0;i<limit;i++)
    {
        printf("%d\t",a[i]);
    }
    printf("\nEven numbers in the array are:\n");
    for(i=0;i<limit;i++)
    {
        if(a[i]%2==0)
        {
            printf("%d\t",a[i]);
            continue;
        }
    }


    return EXIT_SUCCESS;
}