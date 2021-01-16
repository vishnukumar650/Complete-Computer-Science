#include <stdio.h>
#include <stdlib.h>

int main()
{
    int index, i;
    int luckyNumbers[] = {43, 32, 76, 54, 67, 53, 87, 111, 99};
    int size = sizeof(luckyNumbers) / 4;

    for (index = 1; index <= 10; index++)
    {
        printf("%d\n", index);
    }

    printf("\n");

    for (i = 0; i < size; i++)
    {
        printf("%d\n", luckyNumbers[i]);
    }

    return 0;
}

// for loop provides a concise way of writing the loop structure