#include <bits/stdc++.h>
#define endl "\n"
using namespace std;
 
int main() {
 
	std::ios::sync_with_stdio(false);
 
	int testCases;
	cin >> testCases;
 
	while(testCases--) {
		int n;
		cin >> n;
		int a[n];
		for(int i = 0; i < n; i++)
			cin >> a[i];
		int c = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0, product = 1;
			for(int j = i; j >= 0; j--) {
				sum += a[j];
				product *= a[j];
				if(sum == product) c++;
			}
		}
		cout << c << endl;
	}
	return 0;
}
