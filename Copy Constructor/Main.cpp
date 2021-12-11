#include <iostream>
using namespace std;

class hospital {
  private:
  int x,y;
  public:
  hospital(int x1,int y1) {
    x = x1;
    y = y1;
  }
  hospital(const hospital &p2) {
    x = p2.x;
    y = p2.y;
  }
  int getx() {
    return x;
  }
  int gety() {
    return y;
  }
};
    
int main() 
{
	hospital p1(10,15);
  	hospital p2 = p1;
  	
  	cout << "p1.x = " << p1.getx() << ", " <<  "p1.y = " << p1.gety() << endl;
  	cout << "p2.x = " << p2.getx() << ", " <<  "p2.y = " << p2.gety() << endl;
  	
}