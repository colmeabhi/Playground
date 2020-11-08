#include <iostream>
using namespace std;

int main() 
{
  string keys[] = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
  string word;
  cin >> word;
  int flag= 0;
  for(int i = 0; i<=15; i++) {
    if(word == keys[i])
      flag = 1;
  }
  if(flag == 1)
      cout << word << " is a keyword";
  else 
      cout << word << " is not a keyword";
}