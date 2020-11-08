#include<iostream>
using namespace std;
int main()
{

  int xdim, ydim, mat[10][10], temp = 0;
  cin >> xdim >> ydim;
  for( int i = 0; i<xdim; i++) { 
    for( int j = 0; j<ydim; j++) {
      cin >> mat[i][j];
      if(mat[i][j] > temp) {
        temp = mat[i][j];
      }
    }
  }
  cout << "The maximum element is " << temp;
}