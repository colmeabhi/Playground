#include <iostream>
#include <string>
using namespace std;

class testing {
  public:
  	static int count;
  	string s1;
  testing() {
    count++;
  }
  void setmssg(string s) {
    s1 = s;
  }
  void printmssg() {
    cout << s1 << endl;
  }
  static int getcount() {
    return count;
  }
};
int testing :: count = 0;

int main() 
{
  testing t1;
  t1.setmssg("Message one");
  t1.printmssg();
  testing t2;
  t2.setmssg("Message two");
  t2.printmssg();
  testing t3;
  t3.setmssg("Message three");
  t3.printmssg();
  cout << "Total objects created: " << testing :: getcount();
  return 0;
}