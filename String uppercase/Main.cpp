#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
  int slen;
  cin >> str;
  slen = strlen(str);
  cout << "String in uppercase is ";
  for(int i=0; i<slen; i++) {
    if(str[i]>='a' && str[i]<='z') {
      str[i]= str[i]-32;
      cout << str[i];
    }
}
}