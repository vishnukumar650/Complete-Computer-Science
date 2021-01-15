#include <stdio.h>
#include <stdlib.h>

int main()
{
    int first, second, third, fourth;
    first = 5, second = 10;
    third = first, fourth = second;

    printf("first++  : %d \n", first++);  //post increment
    printf("second-- : %d \n", second--); //post decrement
    printf("++third  : %d \n", ++third);  //pre increment
    printf("--fourth : %d \n", --fourth); //pre decrement

    return 0;
}