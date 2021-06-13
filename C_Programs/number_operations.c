#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a, b;
	printf("Enter two numbers: \n");
	scanf("%d%d", &a, &b);
	int sum = a+b;
	int sub = a-b;
	float div = a/b;
	float mod = a%b;
	int prod = a*b;
	printf("Sum of two numbers is: %d\n", sum);
	printf("Difference of two numbers is: %d\n", sub);
	printf("Division of two numbers is: %f\n", div);
	printf("Reminder after division of two numbers is: %f\n", mod);
	printf("Product of two numbers is: %d\n", prod);


	return EXIT_SUCCESS;
}