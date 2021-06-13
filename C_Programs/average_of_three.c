#include <stdio.h>
#include <stdlib.h>

int main(void){
    float a,b,c;
    printf("Please enter three number: \n");
    scanf("%f%f%f",&a,&b,&c);
    float avg = (a+b+c)/3;
    printf("Average of given three numbers is: %f",avg);

    return EXIT_SUCCESS;

}