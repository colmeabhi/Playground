#include<iostream>
using namespace std;
int main()
{
  int sum, mat[20][20], xdim, ydim;
  
  cin >> xdim;
  cin >> ydim;
  
  for(int i =0; i<xdim; i++) {
    for(int j =0; j<ydim; j++) {
      cin >> mat[i][j];
    }
  }
  
  for(int i =0; i<xdim; i++) {
    for(int j =0; j<ydim; j++) {
      sum += mat[i][j];
    }
    cout << sum << endl;
    sum = 0;
  }
}