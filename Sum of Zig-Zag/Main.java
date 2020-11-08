#include<iostream>
using namespace std;
int main()
{
  int xdim, ydim, arr[20][20], sum;
  cin >> xdim;
  cin >> ydim;
  
  for(int i =0; i<xdim; i++) {
    for(int j=0; j<ydim; j++) {
      cin >> arr[i][j];
    }
  }
  
  for(int i =0; i<xdim; i++) {
    for(int j=0; j<ydim; j++) {
      if(i==0 || i==(xdim-1)) {
        //cout << i << " , " << j <<endl;
        sum+=arr[i][j];
      }
      else if(i == j) {
        //cout << i << " , " << j << endl;
        sum+=arr[i][j];
      }
  }
  }
  cout << "Sum of Zig-Zag pattern is " << sum;
}