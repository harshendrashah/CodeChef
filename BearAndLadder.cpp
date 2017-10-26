#include <iostream>

using namespace std;

int main()
{
    int q;
    cin >> q;
    while(q--)
    {
        int a,b;
        bool flag=false;
        cin >> a >> b;
        if(a<b)
        {
            if(a%2==1 && b-a==1)
            {
                flag=true;
            }
            if(b-a==2)
            {
                flag=true;
            }
        }
        else
        {
            if(b%2==1 && a-b==1)
            {
                flag=true;
            }
            if(a-b==2)
            {
                flag=true;
            }
        }
        if(flag==true)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
}
