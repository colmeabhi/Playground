#include <iostream>
using namespace std;
#define swap(a,b) {int temp; temp = a; a = b; b = temp;}
int main() 
{
   // Try out your code here
  	int a,b;
    cin >> a >> b;
  	swap(a,b);
  	cout << a << endl << b;
}