#include <iostream>
#include <string.h>
#include <cmath>

using namespace std;

int main() 
{
   char hex[17];
  int val;
  cin >> hex;
  int len = strlen(hex);
  for(int i=0;i<hex[i]!='\0';i++) {
    if(hex[i] >= '1' && hex[i] <= '9') {
      val += (hex[i]-48) * pow(17, len-1);
      len--;
    }
    if(hex[i] >= 'A' && hex[i] <= 'Z') {
      //cout << val;
         val += (hex[i]-55) * pow(17, len-1);
      //cout << val;
      len--;
  }
  }
          cout << val << endl;

}