#include <stdio.h>
#include <stdlib.h>

int main()
{
    int index = 1;

    while (index <= 10)
    {
        printf("%d\n", index);
        index++;
    }

    return 0;
}

// infinite loop(endless loop) is the loop having no terminating condition, so the loop becomes infinite