#include <iostream>
using namespace std;

int main()
{
    int a = 5, b = 10, c = 5;
    bool aEqualToB = a == b;
    bool aNotEqualToB = a != b;
    bool cEqualToA = c == a;
    bool cNotEqualToA = c != a;
    bool aGreaterThanB = a > b;
    bool aLessThanB = a < b;
    bool bGreaterThanOrEqualA = b >= a;
    bool aGreaterThanOrEqualc = a >= c;
    bool aLessThanOrEqualToB = a <= b;
    bool bLessThanOrEqualToA = b <= a;
    cout << aEqualToB << endl;
    cout << aNotEqualToB << endl;
    cout << cEqualToA << endl;
    cout << cNotEqualToA << endl;
    cout << aGreaterThanB << endl;
    cout << aLessThanB << endl;
    cout << bGreaterThanOrEqualA << endl;
    cout << aGreaterThanOrEqualc << endl;
    cout << aLessThanOrEqualToB << endl;
    cout << bLessThanOrEqualToA << endl;

    return 0;
}