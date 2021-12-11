#include <iostream>
#include <cstring>
using namespace std;

int main() 
{
	char *ptr;
  	int n = 8;
  	ptr = (char*) malloc(10*sizeof(char));
	strcpy(ptr, "Hello C++");
  	cout <<"Before reallocating: "<< ptr << endl;
	ptr = (char*) realloc(ptr, 20*sizeof(char));
  	strcpy(ptr, "Hello, Welcome to C++");
  	cout << "After reallocating: "<<ptr;
}