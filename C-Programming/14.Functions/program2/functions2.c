#include <stdio.h>
#include <stdlib.h>

int square(int num);
float cube(int num);
double simpleInterest(double principle, double time, double rate);

int main()
{
    int number = 11;
    double principle = 20000.0;
    double time = 12.0;
    double rate = 2.0;

    int squareOfNumber = square(number);
    printf("Square of %d is %d \n\n", number, squareOfNumber);

    float cubeOfNumber = cube(number);
    printf("Cube of %d is %.0f \n\n", number, cubeOfNumber);

    double SimpleInterest = simpleInterest(principle, time, rate);
    printf("Simple Interest of %.0lf Rupees for %0.lf months at Rs.%.1lf is %lf \n", principle, time, rate, SimpleInterest);

    return 0;
}

int square(int num)
{
    return num * num;
}

float cube(int num)
{
    return num * num * num;
}

double simpleInterest(double principle, double time, double rate)
{
    return (principle * time * rate) / 100.0;
}
