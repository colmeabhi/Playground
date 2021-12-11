#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int count = 0;
  char str[100],strnew[100];
  cin >> str;
  for(int i=0; i<strlen(str); i++) {
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U') {
  }
 	else { 
      strnew[count] = str[i];
      cout << strnew[count];
      count++;
    }
  }
}