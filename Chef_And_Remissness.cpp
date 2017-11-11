#include <bits/stdc++.h>
#define endl "\n"
using namespace std;
 
int main() {
 
	std::ios::sync_with_stdio(false);
	int testCases;
	cin >> testCases;

	while(testCases--) {
		int a, b;
		cin >> a >> b;
		cout << max(a, b) << " " << a + b << endl;
	}
	return 0;
}
