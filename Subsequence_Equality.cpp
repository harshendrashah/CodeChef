/*
*	Problem Link -> https://www.codechef.com/problems/LIKECS01
*/

#include <bits/stdc++.h>
#define endl "\n"

using namespace std;

int main() {

	std::ios::sync_with_stdio(false);

	int testCases;
	cin >> testCases;

	while (testCases--) {
		string input;
		cin >> input;

		vector<int> characters(26, 0);

		for (int i = 0; i < input.length(); i++)
			++characters[input[i] - 97];
		bool isSub = false;

		for (int i = 0; i < 26; i++) {
			if (characters[i] > 1) {
				isSub = false;
				break;
			}
		}
		if (isSub) cout << "yes" << endl;
		else cout << "no" << endl;
	}

	return 0;
}
