#include <stdio.h>
#include <stdlib.h>

int main()
{
    int luckyNumbers[] = {11, 23, 54, 29, 56, 6, 4, 97};
    float randomNumbers[10];
    double someData[] = {23.4345, 43.5453, 34.4326, 43.5434, 54.146365, 54.4245, 43.443};
    char symbols[10];

    printf("Value stored at 5th index of luckyNumbers integer array is %d \n\n", luckyNumbers[5]);

    randomNumbers[0] = 11.111; // array assignment (asigning randomNumbers float array at index 0)

    printf("Value at 0th index of floating-point array is %.3f \n\n", randomNumbers[0]);

    printf("Data at someData[1] is %lf \n\n", someData[1]);

    symbols[1] = 'V';

    printf("Character stored at index 1 of symbols character array is %c \n", symbols[1]);

    return 0;
}