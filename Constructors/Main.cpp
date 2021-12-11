#include <iostream>
using namespace std;

class company {
  private:
  int id;
  public:
  company() {
    id = 5;
    cout << id << endl;
  }
  company(int ID) {
    id = ID;
    cout << id << endl;
  }
};
int main() 
{
  int ID;
  cout << "Default Constructor called" << endl;
  cout << "Employee id is : ";
    company c1;
  cout << "Parametrized Constructor called" << endl;
  cout << "Employee id is : ";
  	company c2(21);
  
  return 0;
}