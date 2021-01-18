#include <iostream>
using namespace std;

int main()
{
    int a = 123456;
    long b = 123456789101112;
    cout << "Size of int : " << sizeof(a) << endl;
    cout << a << endl;
    cout << "Size of long : " << sizeof(b) << endl;
    cout << b << endl;

    return 0;
}