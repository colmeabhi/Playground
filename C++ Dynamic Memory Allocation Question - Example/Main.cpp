#include <iostream>
using namespace std;

int *roll_no;
int *marks;

int main() 
{
  	int size, i;
  	cin >> size;
	roll_no = new int[size];
  	marks = new int[size];
  
  	if((!marks) || (!roll_no)) {
      cout << "Out of Memory..!!..Aborting..!!" << "endl << Press any key to exit..";
      exit(1);
    }
  	
  	for(i = 0; i < size; i++) {
      cin >> roll_no[i];
      cin >> marks[i];
    }
  	for(i = 0; i < size; i++) {
    	cout << roll_no[i] << " ";
    	cout << marks[i] << endl;
  	}
  	delete[] roll_no;
  	delete[] marks;
}
