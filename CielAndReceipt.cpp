#include <iostream>
#include <math.h>
 
using namespace std;
 
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int p,i=12,j;
        int menu=0;
        cin >> p;
        while(i--)
        {
            j=pow(2,i);
            if(j<=p){
                menu+=p/j;
                p=p%j;
            }
            else
                continue;
            if(p==0)
                break;
        }
        cout << menu << endl;
    }
 
    return 0;
}