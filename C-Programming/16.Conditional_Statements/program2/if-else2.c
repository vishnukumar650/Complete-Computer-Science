#include <stdio.h>
#include <stdlib.h>

int max(int num1, int num2, int num3)
{
    int result;
    if (num1 >= num2 && num1 >= num3)
    {
        result = num1;
    }
    else if (num2 >= num1 && num2 >= num3)
    {
        result = num2;
    }
    else
    {
        result = num3;
    }

    return result;
}

int main()
{
    int number1 = 11;
    int number2 = 19;
    int number3 = 32;
    printf("Maximum of %d, %d and %d is %d \n", number1, number2, number3, max(number1, number2, number3));

    return 0;
}