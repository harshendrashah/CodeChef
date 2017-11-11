#include <bits/stdc++.h>
#define endl "\n"
using namespace std;
 
int main() {
 
	std::ios::sync_with_stdio(false);
 
	int testCases;
	cin >> testCases;
 
	while(testCases--) {
		string a, b;
		cin >> a >> b;
		int minimum = 0, maximum = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a[i] == '?' || b[i] =='?') maximum++;
			else if(a[i] != b[i]) {
				minimum++;
				maximum++;
			}
		}
		cout << minimum << " " << maximum << endl;
	} 
	return 0;
}
