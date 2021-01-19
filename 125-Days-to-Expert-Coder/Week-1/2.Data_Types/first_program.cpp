#include <iostream>
using namespace std;

int main()
{
    int firstNumber, secondNumber;
    int sum, t = 4;
    while (t != 0)
    {
        cin >> firstNumber >> secondNumber;
        sum = firstNumber + secondNumber;
        cout << sum << endl;
        t--;
    }
    return 0;
}