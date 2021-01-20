#include <iostream>
using namespace std;

int main()
{
    int x = 1;
    int y = 1;

    cout << x++ << endl;
    x = 1;
    cout << ++x << endl;

    cout << y++ << endl;
    x = 1;
    cout << ++y << endl;

    return 0;
}