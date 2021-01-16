#include <stdio.h>
#include <stdlib.h>

int main()
{
    int age = 21;
    int *pAge = &age;
    double gpa = 4.2;
    double *pGpa = &gpa;
    char grade = 'A';
    char *pGrade = &grade;

    printf("Age   : %p\n", pAge);
    printf("GPA   : %p\n", pGpa);
    printf("Grade : %p\n", pGrade);

    return 0;
}