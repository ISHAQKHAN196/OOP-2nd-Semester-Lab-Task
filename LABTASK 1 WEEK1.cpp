#include <iostream> 
using namespace std;
int main() {
	int a, reverse = 0;
	cout << "Enter Number To Reverse ( 3 pair no e.g.: 584, 345)" << endl;
	cin >> a;
	reverse = (a % 10) * 100;
	reverse += ((a / 10) % 10) * 10;
	reverse += a / 100;
	cout << "Reverse Of Number Is:" << reverse << endl;
	cout << "ISHAQKHAN-73423";
	return 0;
}
