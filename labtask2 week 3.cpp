#include <iostream>
using namespace std;
int main() {
	int rows, cols;
	cout << "Enter number of rows: ";
	cin >> rows;
	cout << "Enter number of columns: ";
	cin >> cols;
	int matrix[5][5];
	cout << "\nEnter elements of the matrix:\n";
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			cin >> matrix[i][j];
		}
	}
	int primeCount = 0;
	int primeNumbers[25];
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			int num = matrix[i][j];
			int divisors = 0;
			for (int k = 1; k <= num; k++) {
				if (num % k == 0) {
					divisors++;
				}
			}
			if (divisors == 2) {
				primeNumbers[primeCount] = num;
				primeCount++;
			}
		}
	}
	cout << "\nTotal prime numbers in the matrix = " << primeCount << endl;
	if (primeCount > 0) {
		cout << "Prime numbers are: ";
		for (int i = 0; i < primeCount; i++) {
			cout << primeNumbers[i] << " ";
			cout << "ishaqkkhan-73423";
		}
		cout << endl;
	}
	else {
		cout << "No prime numbers found in the matrix." << endl;
	}
	return 0;
}
