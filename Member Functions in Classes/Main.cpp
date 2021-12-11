#include <iostream>
#include <string>
using namespace std;

class classroom {
  private:
  string names;
  int ages;
  public:
  void Display();
  classroom(string name, int age) {
    names = name;
    ages = age;
  }
};

void classroom :: Display() {
  cout << "Student is: " << names << endl;
  cout << "Student id is: " << ages << endl;
};

int main() 
{
   string name;
   int age;
   cin >> name;
   cin >> age;
   classroom s1(name, age);
   s1.Display();
   return 0;
}