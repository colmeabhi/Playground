#include <iostream>
using namespace std;

int main() 
{
  int a, m, rs;
  cin >> a >> m >> rs;
  if(a>m) {
   	cout << rs - (a-m);
  } else if(a<m) {
    cout << rs + (m-a);
  } else if(a==m) {
    cout << rs;
    }
}