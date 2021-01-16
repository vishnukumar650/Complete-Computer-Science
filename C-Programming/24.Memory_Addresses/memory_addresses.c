#include <stdio.h>
#include <stdlib.h>

int main()
{
    int age = 30;
    double gpa = 3.4;
    char grade = 'A';

    printf("age   : %p\n", &age);
    printf("gpa   : %p\n", &gpa);
    printf("grade : %p\n", &grade);

    return 0;
}