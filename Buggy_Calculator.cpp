/*
*	Problem Link -> https://www.codechef.com/problems/BUGCAL
*/

#include <bits/stdc++.h>
#define endl "\n"

using namespace std;

int main() {

	std::ios::sync_with_stdio(false);

	int testCases;
	cin >> testCases;

	while (testCases--) {
		int a, b;
		cin >> a >> b;
		int ans = a + b, i = 10;
		while (true) {
			if (a == 0 || b == 0) break;
			if ((a % 10) + (b % 10) >= 10) ans -= i;
			i *= 10;
			a /= 10;
			b /= 10;
		}
		cout << ans << endl;
	}
	return 0;
}
