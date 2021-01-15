#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number1 = 5, number2;

    number2 = number1; // number2 is 5
    printf("number2 = %d \n", number2);

    number2 += number1; // number2 is 10
    printf("number2 = %d \n", number2);

    number2 -= number1; // number2 is 5
    printf("number2 = %d \n", number2);

    number2 *= number1; // number2 is 25
    printf("number2 = %d \n", number2);

    number2 /= number1; // number2 is 5
    printf("number2 = %d \n", number2);

    number2 %= number1; // number2 is 0
    printf("number2 = %d \n", number2);

    return 0;
}