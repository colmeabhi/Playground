#include<iostream>
using namespace std;
int main()
{
  int xdim, ydim, mat[10][10], temp=0;
  cin >> xdim >> ydim;
	for(int i = 0; i<xdim; i++) { 
      for(int j = 0; j<ydim; j++) {
        cin >> mat[i][j];
       // cout << i << " " << j << endl;
      }
    }
 
  	for(int i = 0; i<ydim; i++) { 
      for(int j = 0; j<xdim; j++) {
        //cout << j << " " << i << endl;
        if(mat[j][i] > temp) 
      		temp = mat[j][i];
      }
  	cout << temp << endl;
  	temp = 0;
    }

}