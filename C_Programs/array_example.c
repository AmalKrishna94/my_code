#include<stdlib.h>
#include<stdio.h>

int main(void){
    int limit;
    int i,a[100];
    printf("Enter the limit: ");
    scanf("%d",&limit);
    printf("Enter the numbers into the array: \n");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Numbers in the array are: \n");
    for(i=0;i<limit;i++)
    {
        printf("%d\n",a[i]);
    }


    return EXIT_SUCCESS;
}