#include <iostream>

using namespace std;

int main()
{
    long n,i,temp;
    cin >> n;
    long arr[n+1]={0};
    for(i=0;i<n;i++)
    {
        cin >> temp;
        arr[temp]++;
    }
    for(i=0;i<=n;i++)
    {
        if(arr[i]==0)
        {
            cout << i << " ";
        }

    }
    cout << endl;
    return 0;
}
