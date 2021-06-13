#include<stdio.h>
#include<stdlib.h>

int main(void){
    int sel,a,b;
    printf("Please enter two numbers:\n");
    scanf("%d%d",&a,&b);
    printf("Please enter appropriate selection: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
    scanf("%d",&sel);
    if(sel==1)
    {
        int sum = a+b;
        printf("The sum of two numbers is: %d",sum);
    }
    else if(sel==2)
    {
        int sub = a-b;
        printf("The difference of two numbers is: %d",sub);
    }
    else if(sel==3)
    {
        int prod = a*b;
        printf("The product of two numbers is: %d",prod);
    }
    else if(sel==4)
    {
        int div = a/b;
        printf("The quotient of division is: %d",div);
    }
    else
    {
        printf("Lol, You're are a fooool..!!");
    }


    return EXIT_SUCCESS;
}