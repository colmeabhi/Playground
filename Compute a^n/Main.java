#include<iostream>
using namespace std;

int power(int a, int n) {
	if(n == 1)
      return a;
    else
      return a*power(a,n-1);
}

int main()
{
  int a, n, y;
  cin >> a;
  cin >> n;
  cout << "Enter the value of a" << endl;
  cout << "Enter the value of n"<< endl;
  cout << "The value of " << a <<" power "<< n << " is ";
  cout << power(a,n);
  
}