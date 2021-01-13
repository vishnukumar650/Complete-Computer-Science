#include <stdio.h>
#include <stdlib.h>

int main()
{
    double number1;
    double number2;

    printf("Enter Number1 : ");
    scanf("%lf", &number1);
    printf("Enter Number2 : ");
    scanf("%lf", &number2);

    printf("\n");

    printf("Addition of %f and %f : %f \n\n", number1, number2, (number1 + number2));
    printf("Subtraction of %f and %f : %f \n\n", number1, number2, (number1 - number2));
    printf("Multiplication of %f and %f : %f \n\n", number1, number2, (number1 * number2));
    printf("Division of %f and %f : %f \n", number1, number2, (number1 / number2));

    return 0;
}