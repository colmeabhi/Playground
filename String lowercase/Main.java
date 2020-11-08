#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  int slen;
  char str[100];
  cin >> str;
  slen = strlen(str);
  cout << "String in lowercase is ";
  for(int i=0;i<slen;i++) {
    if(str[i]>='A' && str[i]<='Z') {
      cout << char(str[i]+32);
    }
  }
}
