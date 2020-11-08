#include <iostream>
using namespace std;

class Boys {
  private:
  	int gang;
  public:
  	void setvalue(int num) {
      gang = num;
    }
  	friend void printvalues(Boys);
};

void printvalues(Boys b1) {
  cout << "Value of a (private data member of class Number) : " << b1.gang;
}

int main() 
{
   Boys b1;
   b1.setvalue(1000);
   printvalues(b1);
}