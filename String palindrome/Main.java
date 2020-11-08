#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
  int slen, count=0;
  cin >> str;
  slen = strlen(str);
    for(int i = 0; i < slen; i++) {
      if(str[i]==str[slen-1-i])
        count++;
      else
        count = 0;
    }
    if(count == slen)
      cout << "Palindrome" << endl;
  	else
      cout << "Not a Palindrome" << endl;
}