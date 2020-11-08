#include<iostream>
using namespace std;
int main()
{
  int xdim, mat[20][20], flag=0;
  cin >> xdim;
  for(int i=0; i<xdim; i++) {
    for(int j=0; j<xdim; j++) {
      cin >> mat[i][j];
    }
  }
  
  for(int i=0; i<xdim; i++) {
    for(int j=0; j<i; j++) {
      cin >> mat[i][j];
      if(mat[i][j]!= 0) {
        flag = 1;
    }
    }
}
  if(flag == 1) 
    cout << "Not an Upper Triangular Matrix";
  else
    cout << "Upper Triangular Matrix";
}