#include <stdio.h>
#include <stdlib.h>

int max(int num1, int num2)
{
    int result;
    if (num1 > num2)
    {
        result = num1;
    }
    else
    {
        result = num2;
    }

    return result;
}

int main()
{
    int number1 = 11;
    int number2 = 9;
    printf("Maximum of %d and %d is %d \n", number1, number2, max(number1, number2));

    return 0;
}