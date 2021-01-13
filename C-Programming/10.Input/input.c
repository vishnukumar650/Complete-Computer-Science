#include <stdio.h>
#include <stdlib.h>

int main()
{
    int age;
    float gpa;
    double pi;
    char luckySymbol;
    char name[20];
    char phrase[20];

    //inputing integer value
    printf("Enter your age: ");
    scanf("%d", &age);
    printf("You are %d years old! \n\n", age);

    //inputing float value
    printf("Enter your GPA: ");
    scanf("%f", &gpa);
    printf("Your GPA is %.1f \n\n", gpa);

    //inputing double value
    printf("Enter your PI Value: ");
    scanf("%lf", &pi);
    printf("Your GPA is %lf \n\n", pi);

    //inputing a character
    printf("Enter your lucky symbol: ");
    scanf(" %c", &luckySymbol);
    printf("Your lucky symbol is %c \n\n", luckySymbol);

    //inputing character array
    printf("Enter your name: ");
    scanf("%s", name);
    printf("Your Name is %s \n\n", name);

    return 0;
}

// fgets method helps to read an input from stdin even after whitespace