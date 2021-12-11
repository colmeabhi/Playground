#include<iostream>
#include<string>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  string actualstr, toberevstr;
  cin >> actualstr;
  cin >> toberevstr;
  
  reverse(toberevstr.begin(), toberevstr.end());
  if(toberevstr == actualstr)
  	cout << "It is correct";
  else  
    cout << "It is wrong";
}