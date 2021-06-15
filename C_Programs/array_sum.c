#include<stdio.h>
#include<stdlib.h>

int main(void){
    int limit,sum=0,a[100],i;
    printf("Please enter the limit: ");
    scanf("%d", &limit);
    printf("Enter the numbers into array: \n");
    for (i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);
        sum = sum + a[i];
    }
    printf("The sum of the numbers is: %d",sum);

    return EXIT_SUCCESS;
}