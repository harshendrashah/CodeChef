#include <iostream>
#include <cstdio>
 
using namespace std;
 
int main(void)
{
 
    int N,p1,p2,max,leader,lead,temp;
    lead=0; max=0;
    cin >> N;
    while(N--)
    {
        cin >> p1 >> p2;
        temp=(p1-p2)+lead;
        if(temp>0)
        {
            lead = temp;
            if(lead>max) {max= lead; leader = 1;}
        }
        else
        {
            lead = temp;
            if(lead*(-1)>max) {max= lead*(-1); leader = 2;}
        }
 
 
    }
    cout << leader << " " << max << endl;
    return 0;
}