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
    /*code for ascending order*/
    for(i=0;i<limit-1;i++)
    {
        for(j=i+1;j<limit;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf("\nSorted numbers in the array in ascending order:\n");
    for(i=0;i<limit;i++)
    {
        printf("%d\t",a[i]);
    }
    /*code for descending order*/
    for(i=0;i<limit-1;i++)
    {
        for(j=i+1;j<limit;j++)
        {
            if(a[i]<a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf("\nSorted numbers in the array in descending order:\n");
    for(i=0;i<limit;i++)
    {
        printf("%d\t",a[i]);
    }


    return EXIT_SUCCESS;
}