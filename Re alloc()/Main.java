#include <iostream>
using namespace std;

int main() 
{
  float n;
  float *ptr, *newptr;
  cout << "Printing Values" << endl;
  ptr = (float*) malloc(5*sizeof(float));
  for( int i=0; i < 5; i++) {
    ptr[i] = i*1.5;
  }
  newptr = (float*) realloc(ptr, 10*sizeof(float));
  for( int i=5; i < 10; i++) {
    newptr[i] = i*2.5;
  }
  for( int i=0; i < 10; i++) {
    cout << newptr[i] << endl;
  } 
  free(newptr);
}