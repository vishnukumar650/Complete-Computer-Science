#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number1 = 12; // 0000 1100
    int number2 = 25; // 0001 1001
                      // 0000 1000 = 8(In decimal)
    printf("Output : %d & %d = %d \n", number1, number2, (number1 & number2));
    return 0;
}