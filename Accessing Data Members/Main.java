#include <iostream>
#include <string>
using namespace std;

class person {
  private:
  string names;
  public:
  person(string name) {
    names = name;
  }
  string getname() {
    return names;
  }
};
  
int main() 
{	
  	string name;
  	cin >> name;
	person p1(name);
  	cout << "I am " << p1.getname();
    return 0;
}