#include <iostream>
using namespace std;

class supermarket {
  public:
  int data;
  void purchase() {
    cout << "I Purchased "<< data << " Books";
  }
};

int main() 
{
  	int n;
  	cin >> n;
    supermarket cust1;
   	cust1.data = n;
  	cust1.purchase();
  	return 0;
}