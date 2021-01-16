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

    printf("Age   : %d\n", *pAge);
    printf("GPA   : %.1lf\n", *pGpa);
    printf("Grade : %c\n", *pGrade);

    printf("\n");

    printf("Age   : %d\n", *&*pAge);
    printf("GPA   : %.1lf\n", *&*pGpa);
    printf("Grade : %c\n", *&*pGrade);

    printf("\n");

    printf("Age   : %d\n", *&*&*pAge);
    printf("GPA   : %.1lf\n", *&*&*pGpa);
    printf("Grade : %c\n", *&*&*pGrade);

    return 0;
}