#include<iostream>
using namespace std;
int main()
{
  int xdim, ydim, i, matx[10][10], maty[10][10];
  cin >> xdim;
  cin >> ydim;
  
  for(int x=0; x<xdim; x++) {
    for(int y=0; y<ydim; y++) {
    cin >> matx[x][y];
    }
  }
  for(int x=0; x<xdim; x++) {
    for(int y=0; y<ydim; y++) {
      cin >> maty[x][y];
    }
  }
  
  for(int x=0; x<xdim; x++) {
    for(int y=0; y<ydim; y++) {
      matx[x][y] = matx[x][y] + maty[x][y];
      cout << matx[x][y] << " ";
    }
    cout << endl;
  }
}