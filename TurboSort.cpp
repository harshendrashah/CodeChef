#include<iostream>
#include<algorithm>
 
using namespace std;
 
int main(){
    int t;
    cin >> t;
    int i=0;
    int arr[t];
    for(i=0;i<t;i++){
        cin >> arr[i];
    }
    sort(arr,arr+t);
    for(i=0;i<t;i++){
        cout << arr[i] << endl;
    }
    return 0;
}