#include <iostream>
#include <string.h>
using namespace std;

int main() 
{
  int a,b;
  char num[100];
  cin >> num;

  int n = strlen(num);

  int i = 1;
  while(n) {
   if(i==0) {
     a+=num[n-1] - 48;
     n--;
     i=1;
  } else if(i==1) {
     b+=num[n-1] - 48;
     n--;
     i=0;
}
  }
cout << abs(a-b);
}