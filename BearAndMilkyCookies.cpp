#include <iostream>
#include <string>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n,i;
        bool flag=true;
        cin >> n;
        string m="milk";
        string c="cookie";
        string str[n];
        for(i=0;i<n;i++)
        {
            cin >> str[i];
        }
        if(c.compare(str[n-1])==0){
            flag=false;
            cout << "NO" << endl;
        }
        else
        {
            for(i=0;i<n-1;i++)
            {
                if(c.compare(str[i])==0 && m.compare(str[i+1])==0)
                {
                    flag=true;
                }
                if(c.compare(str[i])==0 && c.compare(str[i+1])==0)
                {
                    flag=false;
                    break;
                }

            }
            if(flag==false)
                cout << "NO" << endl;
            else
                cout << "YES" << endl;
        }
    }
}
