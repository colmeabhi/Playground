#include <iostream>
using namespace std;

int main() 
{
	int* ptr;
  	ptr = new int;
  	int* ptr1;
  	ptr1 = new int;
  	cin >> *ptr;
  	cin >> *ptr1;
  	cout << *ptr << endl;
  	cout << *ptr1 << endl;
  	delete ptr;
  	delete ptr1;
  	cout << "Pointer 1 deleted" << endl << "Pointer 2 deleted";
}