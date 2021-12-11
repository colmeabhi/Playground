#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  cin >> str;
  for(int i=0; i < str.size(); i++) {
    if((str[i]>64 && str[i]<91) || (str[i]>96 && str[i]<123)){
      cout << str[i];
	}
}
}