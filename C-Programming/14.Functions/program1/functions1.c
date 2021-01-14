#include <stdio.h>
#include <stdlib.h>

void sayHi();
void sayName(char name[]);
void sayFuture(int age, char vehicle[]);

int main()
{
    sayHi();
    sayName("Vishnu");
    sayFuture(24, "Car");
    return 0;
}

void sayHi()
{
    printf("Hello Guest...!!! \n");
}

void sayName(char name[])
{
    printf("Your Name is %s \n", name);
}

void sayFuture(int age, char vehicle[])
{
    printf("You are %d years old \n", age);
    printf("You will buy %s within 5 years \n", vehicle);
}