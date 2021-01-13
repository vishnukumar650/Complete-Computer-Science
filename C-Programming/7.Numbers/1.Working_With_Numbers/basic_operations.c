#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number1 = 20;
    int number2 = 10;
    // Addition
    printf("%d + %d = %d\n", number1, number2, (number1 + number2));

    //Subtraction
    printf("%d - %d = %d\n", number1, number2, (number1 - number2));

    //Multiplication
    printf("%d * %d = %d\n", number1, number2, (number1 * number2));

    //Integer Division
    printf("%d / %d = %d\n", number1, number2, (number1 / number2));

    //Modulus Division
    printf("%d %% %d = %d\n", number1, number2, (number1 % number2));

    //Floating-point Division
    printf("%d / %d = %f\n", number2, number1, (((float)number2) / ((float)number1)));

    return 0;
}