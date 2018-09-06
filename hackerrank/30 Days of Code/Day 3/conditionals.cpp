#include <bits/stdc++.h>

using namespace std;



int main()
{
    int N;
    cin >> N;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    string res;
    
    if (0 == (N % 2)) {
        if (N < 6) {
            res = "Not Weird";
        } else if (N <= 20) {
            res = "Weird";
        } else {
            res = "Not Weird";
        }
    } else {
        res = "Weird";
    }
    
    cout << res << endl;
    return 0;
}
