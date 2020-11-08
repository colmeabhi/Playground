#include <iostream>
using namespace std;
struct TreeHeight
{
 int feets;
 int inches;
};


int main() 
{
  int n;
  cin >> n;
  struct TreeHeight th[n];
  
  for(int i=0; i<n;i++) {
  	cin >> th[i].feets;
    cin >> th[i].inches;
  }
  
  int highest = 0;
  int val;
  for(int j=0;j<n;j++) {
    val = (12*th[j].feets)+th[j].inches;
  	if(highest<val)
      highest = val;
  }
  
  cout << highest;
  
}
