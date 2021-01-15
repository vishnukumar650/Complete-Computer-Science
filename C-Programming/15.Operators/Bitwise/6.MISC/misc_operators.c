#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number1, number2 = 50, number3; // Comma operator, useful to link related expressions together

    int integerVariable;
    float floatVariable;
    double doubleVariable;
    char characterVariable;

    printf("Size of int    = %lu bytes\n", sizeof(integerVariable));
    printf("Size of float  = %lu bytes\n", sizeof(floatVariable));
    printf("Size of double = %lu bytes\n", sizeof(doubleVariable));
    printf("Size of char   = %lu byte\n", sizeof(characterVariable));

    return 0;
}