#include<iostream>
using namespace std;
int main()
{
  int mat[20][20], xdim, ydim, flag, nflag=0;
  cin >> xdim;
  cin >> ydim;
  for(int i = 0; i<xdim; i++) {
    for(int j = 0; j<ydim; j++) {
      cin >> mat[i][j];
    }
  }
  for(int i = 0; i<xdim; i++) {
    for(int j = 0; j<ydim; j++) {
      if(mat[i][j] == mat[j][i]) 
        flag=1;
      else
        nflag=1;
    }
  }
 if(flag == 1 && nflag == 0) 
  	cout << "Symmetric";
 else
   cout << "Not Symmetric";
 }
