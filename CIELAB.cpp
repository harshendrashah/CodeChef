#include<iostream>

using namespace std;

int main(){
    int a,b,result,temp,temp2,count=1;
    cin >> a >> b;
    result=a-b;
    temp=result%10;
    temp2=result;
    if(temp<9)
        result=result+1;
    else if(temp==9)
    {
        result=result-1;
    }
    cout << result << endl;
    return 0;
}
