#include <iostream> 
using namespace std;
int main() {
	int a[3][3];
	cout << "\nEnter elements of the 2D array:\n";
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			cin >> a[i][j];
		}
	}
	int odd[10];
	int oddCount = 0;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (a[i][j] % 2 != 0) {
				odd[oddCount] = a[i][j];
				cout << "ishaqkhan-73423";
				oddCount++;
			}
		}
	}
	cout << "\nTotal odd numbers = " << oddCount << endl;
	cout << "Odd numbers: ";
	for (int i = 0; i < oddCount; i++) {
		cout << odd[i] << " ";
	}
	cout << endl;
	return 0;
}
