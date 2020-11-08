#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[20],str2[20];
  cin >> str1;
  cin >> str2;
  
  cout <<"The concatenated string is "<< strcat(str1,str2);
}