#include <iostream>
using namespace std;

enum person
{
    SIT,
    STAND,
    WALK
} p1;
enum life
{
    SUCCESS = 3,
    FAILURE = 5,
    MEDIOCRE = 9
} l1;
enum designFlags
{
    BOLD = 1,
    ITALICS = 2,
    UNDERLINE = 4
} button;
int main()
{
    p1 = WALK;
    cout << p1 << endl;

    person p2;
    p2 = STAND;
    cout << p2 << endl;

    l1 = SUCCESS;
    cout << l1 << endl;

    int myDesign = BOLD | UNDERLINE;
    cout << myDesign << endl;

    return 0;
}
