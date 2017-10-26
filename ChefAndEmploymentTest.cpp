#include <iostream>
#include <vector>
#include <algorithm>
 
using namespace std;
 
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n,k,max=0,index,med;
        cin >> n >> k;
        vector <int> arr;
        int i=0,temp;
        for(i=0;i<n;i++)
        {
            cin >> temp;
 
            arr.push_back(temp);
            if(temp>=max)
            {
                max=temp;
                index=arr.size()-1;
            }
        }
        for(i=0;i<k;i++)
        {
            temp=arr[index]+i+1;
            arr.push_back(temp);
        }
        sort(arr.begin(),arr.end());
        med=arr[arr.size()/2];
        cout << med << endl;
    }
}