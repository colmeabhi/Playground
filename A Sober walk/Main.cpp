#include <iostream>
using namespace std;

int main() 
{
   int x,y,n;
  x=0;y=0;
  cin >> n;
  int flag=1;
  int multi=1;
  for(int i=0;i<n;i++) {
    if(flag==1) {
      x = abs(x) + 10;
      y = abs(y);
      multi++;
      flag = 2;
    }
    else if(flag==2) {
      y = y + 20;
      multi++;
      flag = 3;
    }
    else if(flag==3) {
      x = x - multi*10;
      multi++;
      flag = 4;
    }
    else if(flag==4) {
      y = y - multi*10;
      multi++;
      flag = 1;
    }
  }
  cout << x << " " << y;
      
      
}