#include <iostream>
using namespace std;

class classroom {
  private:
  int value;
  public:
  classroom(int val) {
    value = val;
  }
  void Display();
};

void classroom :: Display() {
  cout << "FACEPREP.com" << endl << "Let's learn together" << endl << "Value is: " << value;
}
int main() 
{
  int val;
  cin >> val;
  classroom c1(val);
  c1.Display();
}