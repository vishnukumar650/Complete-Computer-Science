#include <stdio.h>
#include <stdlib.h>

int main()
{
    char name[] = "Vishnu Kumar";
    float weight = 51.25;
    char luckyCharacter = 'V';
    double myBagWeight = 3.547646;
    printf("Hello ");
    printf("World\n");
    printf("My Name is %s\n", name);
    printf("My Favourite %s is %d\n", "number", 11);
    printf("I weight %f kilograms\n", weight);
    printf("My Favourite Character is %c\n", luckyCharacter);
    printf("My Bag Weight %lf\n", myBagWeight);

    return 0;
}

/*
    Format Specifiers
        %c  -   character
        %d  -   integer
        %f  -   float
        %s  -   character array (string)
        %lf -   double
*/