#include <iostream> 
using namespace std;

int main() {
	int a, b;
	cout << "Enter 2 Numbers To Swap:" << endl;
	cin >> a >> b;
	a = a + b;
	b = a - b;
	a = a - b;
	cout << "Values After Swap Are:" << endl;
	cout << "a=" << a << endl;
	cout << "b=" << b << endl;
	return 0;
}
f