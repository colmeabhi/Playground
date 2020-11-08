#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int whitespaces=0, vowels=0, consonents=0, digits=0, symbols=0;
  string str;
  getline(cin, str);
  for(int i=0; str[i]!='\0'; i++) {
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U') {
      vowels++;
      //cout << "1";
    }
    else if(str[i]==' ') {
      whitespaces++;
      //cout << "2";
    }
    else if(isdigit(str[i])) {
      digits++;
      //cout << "3";
    }
    else if(str[i] > 64 && str[i] < 123) {
      consonents++;
      //cout << "4";
    }
    else {
      symbols++;
    }

}
  cout << "Vowels:" << vowels << endl;
  cout << "Consonants:" << consonents << endl;
  cout << "White Spaces:" << whitespaces << endl;
  cout << "Digits:" << digits << endl;
  cout << "Symbols:" << symbols << endl;
}