#include<iostream>
#include<string>
using namespace std;
int main()
{
  int count = 0;
  string str1, str2;
  cin >> str1; // Substring
  cin >> str2; // Main string

  for(int j=0; j<str2.size(); j++) {
    if(str1[count] == str2[j]) {
      count++;
    }
    else {
      cout << str2[j];
    }
  }
}
