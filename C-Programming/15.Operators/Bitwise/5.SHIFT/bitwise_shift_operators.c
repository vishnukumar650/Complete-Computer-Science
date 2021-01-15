#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number = 128;

    printf("Right shift by %d: %d\n", 0, number >> 0);
    printf("Right shift by %d: %d\n", 1, number >> 1);
    printf("Right shift by %d: %d\n", 2, number >> 2);

    printf("\n");

    printf("Left shift by %d: %d\n", 0, number << 0);
    printf("Left shift by %d: %d\n", 1, number << 1);
    printf("Left shift by %d: %d\n", 2, number << 2);

    return 0;
}