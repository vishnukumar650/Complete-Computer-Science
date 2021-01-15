#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number1 = 15, number2 = 15, number3 = 25;

    printf("%d == %d is %d \n", number1, number2, number1 == number2); // returns 1

    printf("%d == %d is %d \n", number1, number3, number1 == number3); // returns 0

    printf("%d >  %d is %d \n", number1, number2, number1 > number2); // returns 0

    printf("%d >  %d is %d \n", number1, number3, number1 > number3); //returns 0

    printf("%d <  %d is %d \n", number1, number2, number1 < number2); // returns 0

    printf("%d <  %d is %d \n", number1, number3, number1 < number3); // returns 1

    printf("%d != %d is %d \n", number1, number2, number1 != number2); // returns 0

    printf("%d != %d is %d \n", number1, number3, number1 != number3); // returns 1

    printf("%d >= %d is %d \n", number1, number2, number1 >= number2); // returns 1

    printf("%d >= %d is %d \n", number1, number3, number1 >= number3); //returns 0

    printf("%d <= %d is %d \n", number1, number2, number1 <= number2); // returns 1

    printf("%d <= %d is %d \n", number1, number3, number1 <= number3); // returns 1

    return 0;
}