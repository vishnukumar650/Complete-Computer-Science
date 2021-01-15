#include <stdio.h>
#include <stdlib.h>

int main()
{
    double number1;
    double number2;
    char operator;

    printf("Enter a number: ");
    scanf("%lf", &number1);
    printf("Enter operator: ");
    scanf(" %c", &operator);
    printf("Enter a number: ");
    scanf("%lf", &number2);

    if (operator== '+')
    {
        printf("%lf + %lf = %lf\n", number1, number2, (number1 + number2));
    }
    else if (operator== '-')
    {
        printf("%lf - %lf = %lf\n", number1, number2, (number1 - number2));
    }
    else if (operator== '*')
    {
        printf("%lf * %lf = %lf\n", number1, number2, (number1 * number2));
    }
    else if (operator== '/')
    {
        printf("%lf / %lf = %lf\n", number1, number2, (number1 / number2));
    }
    else
    {
        printf("Invalid Operator \n");
    }

    return 0;
}