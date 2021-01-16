#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// struct is short for structure
struct Student
{
    char name[50];
    char major[50];
    int age;
    float gpa;
};

void printStudentData(struct Student student);

int main()
{
    struct Student student1;
    student1.age = 21;
    student1.gpa = 3.5;
    strcpy(student1.name, "Jim");
    strcpy(student1.major, "Business");

    printStudentData(student1);
    printf("\n");

    struct Student student2;
    student2.age = 25;
    student2.gpa = 4.2;
    strcpy(student2.name, "Tim");
    strcpy(student2.major, "Art");

    printStudentData(student2);

    return 0;
}

void printStudentData(struct Student student)
{
    printf("Student Name : %s\n", student.name);
    printf("Majoring in %s\n", student.major);
    printf("%s is %d years old\n", student.name, student.age);
    printf("%s secured %.1lf GPA\n", student.name, student.gpa);
}