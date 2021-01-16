#include <stdio.h>
#include <stdlib.h>
#include <string.h>

union Data
{
    int i;
    float f;
    char str[20];
};

int main()
{

    union Data data;

    printf("Memory size occupied by data : %d\n", sizeof(data));

    data.i = 10;
    data.f = 220.5;
    strcpy(data.str, "C Programming");

    printf("data.i   : %d\n", data.i);   // i value is corrupted
    printf("data.f   : %f\n", data.f);   // f value is corrupted
    printf("data.str : %s\n", data.str); // str value is not corrupted. Since, it is the last assignment

    /* Lets use one variable at a time which is the main purpose of having unions */
    data.i = 10;
    printf("data.i   : %d\n", data.i);

    data.f = 220.5;
    printf("data.f   : %f\n", data.f);

    strcpy(data.str, "C Programming");
    printf("data.str : %s\n", data.str);

    return 0;
}
