#include<iostream>
#include<string.h>
using namespace std;

int main()
{
  char str1[20],str2[20];
  cin >> str1;
  strcpy(str2,str1);
  cout << "The copied string is "<< str2;
}