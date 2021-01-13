#include <stdio.h>
#include <stdlib.h>

int main()
{
    char characterName[] = "Vishnu"; // character array (string)
    int characterAge = 71;           // integer variable
    printf("There once was a man named %s\n", characterName);
    printf("He was %d years old.\n", characterAge);
    characterAge = 31; //variable can be modified at any point of the program after declaring.
    printf("He really liked the name %s\n", characterName);
    printf("But did not like being %d.\n", characterAge);

    return 0;
}