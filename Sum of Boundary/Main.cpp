#include<iostream>
using namespace std;

int main()
{
  int mat[20][20], xdim, ydim, sum = 0;
  cin >> xdim >> ydim;
  for(int i=0; i<xdim; i++) {
    for(int j=0; j<ydim; j++) {
      cin >> mat[i][j];
    }
  }

  for(int i=0; i<xdim; i++) {
    for(int j=0; j<ydim; j++) {
  		if((i==0 || i== (xdim-1) || j==0 || j==(ydim-1))) {
          sum += mat[i][j];
        }
  }
  }
  cout << "Sum of boundaries is " << sum;
    
}