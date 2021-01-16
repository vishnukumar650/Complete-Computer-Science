#include <stdio.h>
#include <stdlib.h>

int main()
{
    int index = 11;
    // do while loop is a control flow statement that executes a block of code at least once
    do
    {
        printf("%d\n", index);
        index++;
    } while (index <= 10);

    return 0;
}