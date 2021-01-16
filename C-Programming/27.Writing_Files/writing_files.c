#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fpointer = fopen("employees.txt", "w"); // file modes - w(write), r(read), a(append)

    fprintf(fpointer, "Mark Tim\nSam Billings\nRam Manoj\n");

    fprintf(fpointer, "Narine Make\nSunder Raj\nRock Kayne");

    fclose(fpointer);

    return 0;
}