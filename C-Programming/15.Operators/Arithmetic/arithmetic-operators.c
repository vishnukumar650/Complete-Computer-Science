#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number1 = 43, number2 = 38, result;

    result = number1 + number2;
    printf("%d + %d = %d \n", number1, number2, result);

    result = number1 - number2;
    printf("%d - %d = %d \n", number1, number2, result);

    result = number1 * number2;
    printf("%d * %d = %d \n", number1, number2, result);

    result = number1 / number2;
    printf("%d / %d = %d \n", number1, number2, result);

    result = number1 % number2;
    printf("%d %% %d = %d \n", number1, number2, result);

    return 0;
}