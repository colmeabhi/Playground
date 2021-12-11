#include<iostream>
using namespace std;
int main()
{
  int mat[10][10], temp, xdim, ydim;
  cin >> xdim >> ydim;
  for(int i = 0; i<xdim; i++) {
    for(int j = 0; j<ydim; j++) {
      cin >> mat[i][j];
      if(temp < mat[i][j])
        temp = mat[i][j];
    }
    cout << temp << endl;
    temp = 0;
  }
}