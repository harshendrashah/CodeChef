#include <iostream>
using namespace std;

int main() {

	int testCases;
	cin >> testCases;
	
	while (testCases--) {
		int a, b;
		cin >> a >> b;
		a > b ? cout << ">" << endl : (a < b ? cout << "<" << endl : cout << "=" << endl);
	}	
	return 0; 
}
