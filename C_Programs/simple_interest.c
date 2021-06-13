#include <stdio.h>
#include <stdlib.h>

int main(void){
    int P;
    float SI,R,n;
    printf("Please enter the Principal amount(P): ");
    scanf("%d", &P);
    printf("Please enter the Interest rate(R): ");
    scanf("%f", &R);
    printf("Please enter the Number of years(n): ");
    scanf("%f", &n);
    SI = (P*R*n)/100;
    printf("The Simple Interest(SI) is: %f", SI);

    return EXIT_SUCCESS;

}