#include<iostream> 
using namespace std;
void factorial() {
	int a;
	cout << "Enter Number For Factorial:" << endl;
	cin >> a;
	int fact = 1;
	for (int i = 1; i <= a; i++)
		fact *= i;
	cout << "Factorial of " << a << " is=" << fact << endl;
}
int main() {
	factorial();
	return 0;
}
