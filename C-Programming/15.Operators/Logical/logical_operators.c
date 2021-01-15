#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number1 = 10, number2 = 10, number3 = 20, result;

    result = (number1 == number2) && (number3 > number2); // returns 1
    printf("(number1 == number2) && (number3 > number2) is %d \n", result);

    result = (number1 == number2) && (number3 < number2); // returns 0
    printf("(number1 == number2) && (number3 < number2) is %d \n", result);

    result = (number1 == number2) || (number3 < number2); // returns 1
    printf("(number1 == number2) || (number3 < number2) is %d \n", result);

    result = (number1 != number2) || (number3 < number2); // returns 0
    printf("(number1 != number2) || (number3 < number2) is %d \n", result);

    result = !(number1 != number2); // returns 1
    printf("!(number1 != number2) is %d \n", result);

    result = !(number2 == number2); // returns 0
    printf("!(number1 == number2) is %d \n", result);

    return 0;
}