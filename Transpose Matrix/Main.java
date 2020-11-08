#include<iostream>
using namespace std;
int main()
{
  int xdim, ydim, matx[10][10];
  cin >> xdim;
  ydim = xdim;
  
  for(int x=0; x<xdim; x++) {
    for(int y=0; y<ydim; y++) {
    cin >> matx[x][y];
    }
  }
  
    for(int x=0; x<xdim; x++) {
    for(int y=0; y<ydim; y++) {
    cout<< matx[x][y] << " ";
    }
      cout << endl;
  }
  
  cout << "Transpose matrix is:" << endl;
  
  for(int x=0; x<xdim; x++) {
    for(int y=0; y<ydim; y++) {
      cout << matx[y][x] << " ";
    }
    cout << endl;
  }
}
  
