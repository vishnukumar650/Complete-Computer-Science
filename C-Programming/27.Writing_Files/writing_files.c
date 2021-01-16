#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fpointer = fopen("employees.txt", "w"); // file modes - w(write), r(read), a(append)

    fprintf(fpointer, "Mark Tim, Salesman\nSam Billings, Analyst\nRam Manoj, Programmer\n");

    fprintf(fpointer, "Narine Make, Typist\nSunder Raj, Singer\nRock Kayne, Plumber");

    fclose(fpointer);

    return 0;
}