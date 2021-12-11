#include <iostream>
using namespace std;

int main() 
{
   int* ptr;
   int n = 5;
   ptr = (int*)malloc(n*sizeof(int));
  cin >> ptr[0];
  cin >> ptr[1];
  cin >> ptr[2];
  cin >> ptr[3];
  cin >> ptr[4];
  cout << endl;
  cout << "User entered value" << endl;
  cout << ptr[0]<< endl;
  cout << ptr[1]<< endl;
  cout << ptr[2]<< endl;
  cout << ptr[3]<< endl;
  cout << ptr[4]<< endl;
  cout << "Garbage Value" << endl;

 
}