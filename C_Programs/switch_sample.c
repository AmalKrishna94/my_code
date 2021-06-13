#include<stdlib.h>
#include<stdio.h>

int main(void){
    int choice;
    printf("Menu:\n1. Porotta\n2. Biriyani\n3. Fried rice\n4. Mandhi\nPlease enter your choice below:\n");
    scanf("%d",&choice);
    switch(choice){
        case 1:
        printf("You've selected Porotta..!!");
        break;
        case 2:
        printf("You've selected Biriyani..!!");
        break;
        case 3:
        printf("You've selected Fried rice..!!");
        break;
        case 4:
        printf("You've selected Mandhi..!!");
        break;
        default:
        printf("You're a fooool..!!");
    }

    return EXIT_SUCCESS;

}