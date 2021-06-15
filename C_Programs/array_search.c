#include<stdlib.h>
#include<stdio.h>

int main(void){
    int limit,a[100],i,search,flag=0;
    printf("Enter the limit of array: ");
    scanf("%d", &limit);
    printf("Enter the numbers into the array:\n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the number to be searched in the array: ");
    scanf("%d",&search);
    printf("Searching for the number....\n");
    for(i=0;i<limit;i++)
    {
        if(search==a[i])
        {
            flag=1;
            break;
        }       
    }
    if(flag==1)
    {
        printf("%d is there in the array at the position %d.",search,i+1);
    }
    else
    {
        printf("%d is not there in the array..!!",search);
    }
    

    return EXIT_SUCCESS;
}
